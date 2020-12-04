package Springboot.CEN4010;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class SpringbootCEN4010 extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCEN4010.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringbootCEN4010.class);
	}

}
