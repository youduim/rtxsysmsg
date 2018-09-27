package im.youdu.wsdk.pojo;

import im.youdu.sdk.entity.SysMsgBody;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Constants {
    public static String SysMsgApp = "sysMsgAssistant";
    private static Pattern SysMsgPatten = Pattern.compile("(\\[([\\s\\S]*?)\\|([\\s\\S]+?)(?:\\|([01]*?)){0,1}\\])");
    public static SysMsgBody ParseSysMsg(String title, String msg) {
        SysMsgBody body = new SysMsgBody(title);
        Matcher m = SysMsgPatten.matcher(msg);
        int pos = 0;
        while (m.find()) {
            if (m.start() != pos) {
                String txt = msg.substring(pos, m.start());
                body.addTextBody(txt);
            }

            String name = m.group(2);
            String link = m.group(3);
            Integer action=0;
            if(m.group(4)!=null){
                action = Integer.valueOf(m.group(4).isEmpty() ? "0" : m.group(4));
            }
            body.addLinkBody(link, name, action);
            pos = m.end();
        }
        if (pos!=msg.length()){
            body.addTextBody(msg.substring(pos));
        }
        return body;
    }

    public static void main(String[] args) {
        ParseSysMsg("ttt", "aaa[|ss|]bbb[s|ss2|1]ccccc");

    }
}
