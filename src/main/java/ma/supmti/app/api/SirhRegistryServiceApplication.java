package ma.supmti.app.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer 
@SpringBootApplication
public class SirhRegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SirhRegistryServiceApplication.class, args);
	}

}
