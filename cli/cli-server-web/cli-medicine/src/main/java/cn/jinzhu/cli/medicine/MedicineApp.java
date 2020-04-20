package cn.jinzhu.cli.medicine;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@MapperScan("cn.jinzhu.cli.medicine.mapper")
@SpringBootApplication
@EnableOAuth2Sso
@EnableSwagger2
public class MedicineApp {
	public static void main(String[] args) {
		SpringApplication.run(MedicineApp.class, args);
	}
}
