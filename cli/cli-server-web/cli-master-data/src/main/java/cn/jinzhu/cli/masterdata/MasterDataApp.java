package cn.jinzhu.cli.masterdata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@MapperScan("cn.jinzhu.cli.masterdata.mapper")
@SpringBootApplication
@EnableOAuth2Sso
@EnableSwagger2
public class MasterDataApp {
	public static void main(String[] args) {
		SpringApplication.run(MasterDataApp.class, args);
	}
}
