package config.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import config.com.DemoManager;
import config.com.DemoManagerImpl;

@Configuration
public class ApplicationConfiguration {
	
	@Bean(name="demoService")
    public DemoManager helloWorld() {
        return new DemoManagerImpl();
    }

}
