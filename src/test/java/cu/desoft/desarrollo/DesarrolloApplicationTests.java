package cu.desoft.desarrollo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import cu.desoft.desarrollo.model.User;
import cu.desoft.desarrollo.repositorio.UserRepo;

@SpringBootTest
class DesarrolloApplicationTests {
	
	@Autowired
	private UserRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	void CrearUserNuevo() {
		User u = new User();
		u.setDescripcion("Descrppp");
		u.setEmail("mail@hhh.ci");
		u.setUsername("Full");
		u.setPassword(encoder.encode("Tata"));
		u.setRol(new String[] {"Admin"});
		User retorno = repo.save(u);
		
		assertTrue(retorno.getPassword().equalsIgnoreCase(u.getPassword()));
	}

}
