package cu.desoft.desarrollo.repositorio;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cu.desoft.desarrollo.model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {
	
	Optional<User> getUserById(Integer id);
	User getUserByNombre(String nombre);
	void deleteUserById(Integer id);
	
//	User findByUserNameOrEmail(String nombre, String email);
}