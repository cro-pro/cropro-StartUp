package hr.cropro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import hr.cropro.services.TestService;

@Configuration
public class AppConfig {

	@Bean
	public TestService testService() {
		return new TestService();
	}
	
	/**
	 * Definiranje messageSorce-a. Messages file nalazi se u src/main7resources "messages.properties".
	 * @return
	 */
    @Bean(name = "messageSource")
    public ReloadableResourceBundleMessageSource getMessageSource() {
        ReloadableResourceBundleMessageSource resource = new ReloadableResourceBundleMessageSource();
        resource.setBasename("classpath:messages");
        resource.setDefaultEncoding("UTF-8");
        return resource;
    }
    
}
