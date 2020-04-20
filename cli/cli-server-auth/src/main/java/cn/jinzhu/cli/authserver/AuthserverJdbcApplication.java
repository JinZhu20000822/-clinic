package cn.jinzhu.cli.authserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class AuthserverJdbcApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthserverJdbcApplication.class, args);
    }
}
