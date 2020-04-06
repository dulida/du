package com.lida.du;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author Lida Du
 * @Date 2020/3/25 14:18
 */
@SpringBootApplication
public class WebAdminApp {
    public static void main(String[] args) {
        SpringApplication.run(WebAdminApp.class, args);
    }
}
