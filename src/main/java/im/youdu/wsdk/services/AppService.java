package im.youdu.wsdk.services;


import im.youdu.sdk.client.AppClient;
import im.youdu.sdk.entity.YDApp;
import im.youdu.wsdk.controller.RequestFilter;
import im.youdu.wsdk.pojo.IpFilterConfig;
import im.youdu.wsdk.pojo.YDAppInfo;
import im.youdu.wsdk.pojo.YdEnv;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Component
public class AppService {


    Logger log = LoggerFactory.getLogger(AppService.class);

    private YdEnv ydEnv;

    private ConcurrentMap<String, AppClient> appMap = new ConcurrentHashMap<String, AppClient>();

    public AppService() {
        ApplicationContext ctx = null;
        try {
            ctx = new ClassPathXmlApplicationContext("youdu-beans.xml");
            ydEnv = (YdEnv) ctx.getBean("ydEnv");
            Map<String, YDAppInfo> map = ctx.getBeansOfType(YDAppInfo.class);
            for (Map.Entry<String, YDAppInfo> entry : map.entrySet()) {
                YDAppInfo app = entry.getValue();
                if (app.getAppId() == null || app.getAppId().trim().isEmpty() ||
                        app.getAeskey() == null || app.getAeskey().trim().isEmpty()) {
                    log.info("app Service init: invalid {}", entry.getKey());
                    continue;
                }
                YDApp ydApp = new YDApp(ydEnv.getBuin(), ydEnv.getAddr(), app.getName(), app.getAppId(), app.getToken(), app.getAeskey());
                AppClient client = new AppClient(ydApp);
                appMap.put(app.getAppId().trim(), client);
                log.info("app Service init:{},{}", app.getAppId(), entry.getKey());

                if (!entry.getKey().contains("pojo.YDAppInfo#")) {
                    appMap.put(entry.getKey().trim(), client);
                }
            }
            RequestFilter.setConfig(ctx.getBean("ipFilter", IpFilterConfig.class));

        } catch (BeansException e) {
            log.error("load app error:", e);
        }
    }

    public AppClient get(String appId) {
        AppClient app = appMap.get(appId);
        return app;
    }
}

