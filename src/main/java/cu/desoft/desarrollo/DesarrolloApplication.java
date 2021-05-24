package cu.desoft.desarrollo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import cu.desoft.desarrollo.repositorio.UserRepo;



//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})	
@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepo.class)
public class DesarrolloApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(DesarrolloApplication.class, args);
	}

}
