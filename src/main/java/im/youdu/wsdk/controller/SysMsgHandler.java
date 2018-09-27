package im.youdu.wsdk.controller;


import im.youdu.sdk.client.AppClient;
import im.youdu.sdk.entity.SysMsgBody;
import im.youdu.wsdk.pojo.Constants;
import im.youdu.wsdk.services.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotEmpty;
import java.security.InvalidParameterException;

@Validated
@RestController
public class SysMsgHandler {
    Logger log = LoggerFactory.getLogger(SysMsgHandler.class);
    @Autowired
    AppService service;

    @RequestMapping("/")
    public String Index() {
        return "/sendsysmsg.cgi?users=xx&title=标题&msg=消息正文";
    }

    @RequestMapping("/sendsysmsg.cgi")
    public String sendSysMsg(String users, String depts, @NotEmpty(message = "title不能为空") String title, @NotEmpty(message = "msg不能为空") String msg) throws Exception {

        if ((users == null || users.isEmpty()) && (depts == null || depts.isEmpty())) {
            throw new InvalidParameterException("users和 depts不能同时为空");
        }
        log.info("sendsysmsg:{},{}", msg, users);
        AppClient client = service.get(Constants.SysMsgApp);
        SysMsgBody body = Constants.ParseSysMsg(title, msg);
        client.sendSysMsg(users, depts, body);
        return "OK";
    }
    @RequestMapping("/sendnotify.cgi")
    public String sendSysMsg(String receiver,@NotEmpty(message = "msg不能为空") String msg,String title)throws Exception{
        int delaytime=0;
        String okurl="";
        String errurl="";
        if ((receiver == null || receiver.isEmpty())) {
            throw new InvalidParameterException("users和 depts不能同时为空");
        }
        receiver=receiver.replace(',','|');
        log.info("sendsysmsg:{},{}", msg, receiver);
        AppClient client = service.get(Constants.SysMsgApp);
        SysMsgBody body = Constants.ParseSysMsg(title, msg);
        client.sendSysMsg(receiver,"", body);
        return "OK";
    }
}
