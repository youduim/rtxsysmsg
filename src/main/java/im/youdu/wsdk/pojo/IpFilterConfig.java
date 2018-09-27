package im.youdu.wsdk.pojo;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class IpFilterConfig {

    private Set<String> allows;
    private Set<String> denies = new HashSet<String>();
    private boolean defaultAllow;

    public Set<String> getAllows() {
        return allows;
    }

    public void setAllows(Set<String> allows) {
        this.allows = allows;
        System.out.println("============" + allows.size());
    }

    public Set<String> getDenies() {
        return denies;
    }

    public void setDenies(Set<String> denies) {
        this.denies = denies;
    }

    public boolean isDefaultAllow() {
        return defaultAllow;
    }

    public void setDefaultAllow(boolean defaultAllow) {
        this.defaultAllow = defaultAllow;
    }


    public boolean filter(String ip) {
        System.out.println(allows);
        if (ip.equals("127.0.0.1") || ip.equals("localhost") || ip.equals("0:0:0:0:0:0:0:1")) {
            return true;
        }
        if (defaultAllow) {
            return !denies.contains(ip);
        } else {
            for (String i : allows
                    ) {
                System.out.println(i);
            }
            return allows.contains(ip);
        }
    }
}
