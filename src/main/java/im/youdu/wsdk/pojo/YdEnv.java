package im.youdu.wsdk.pojo;


import org.springframework.stereotype.Component;

@Component
public class YdEnv {
    private String addr;
    private Integer buin;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getBuin() {
        return buin;
    }

    public void setBuin(Integer buin) {
        this.buin = buin;
    }
}
