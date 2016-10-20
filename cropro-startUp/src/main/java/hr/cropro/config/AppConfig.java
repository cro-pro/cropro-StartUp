package hr.cropro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hr.cropro.services.TestService;

@Configuration
public class AppConfig {

	@Bean
	public TestService testService() {
		return new TestService();
	}

}
