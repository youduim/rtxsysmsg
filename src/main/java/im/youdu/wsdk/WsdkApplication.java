package im.youdu.wsdk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@ServletComponentScan
public class WsdkApplication {

    public static void main(String[] args) {
        SpringApplication.run(WsdkApplication.class, args);
    }
}
