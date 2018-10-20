package kz.phobos.tm.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "kz")
public class ApiApplication {
    public static void main(String []args)
    {
        SpringApplication.run(ApiApplication.class);
    }
}
