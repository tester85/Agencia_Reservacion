package cu.desoft.desarrollo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import cu.desoft.desarrollo.rest.UsuarioRepo;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})	
@SpringBootApplication
public class DesarrolloApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(DesarrolloApplication.class, args);
	}

}
