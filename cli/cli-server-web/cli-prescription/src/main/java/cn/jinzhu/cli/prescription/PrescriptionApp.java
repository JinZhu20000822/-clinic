package cn.jinzhu.cli.prescription;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@MapperScan("cn.jinzhu.cli.prescription.mapper")
@SpringBootApplication
@EnableOAuth2Sso
@EnableSwagger2
public class PrescriptionApp {
	public static void main(String[] args) {
		SpringApplication.run(PrescriptionApp.class, args);
	}
}
