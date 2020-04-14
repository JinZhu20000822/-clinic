package cn.jinzhu.cli.prescription.config;

import cn.jinzhu.cli.common.http.HttpClientHelper;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HisConfig {

	@Bean
	HttpClientHelper httpClientHelper(HttpServletRequest request) {
		return new HttpClientHelper(request);
	}
}
