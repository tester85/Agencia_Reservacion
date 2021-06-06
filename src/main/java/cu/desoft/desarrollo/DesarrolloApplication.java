package cu.desoft.desarrollo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import cu.desoft.desarrollo.repositorio.UserRepo;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepo.class)
@ComponentScan("cu.desarrollo.utility")
public class DesarrolloApplication {
		
	public static void main(String[] args) {
		SpringApplication.run(DesarrolloApplication.class, "");
	}

}
 