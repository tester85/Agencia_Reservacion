package cu.desoft.desarrollo.repositorio;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cu.desoft.desarrollo.model.User;
import cu.desoft.desarrollo.model.UserDTO;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {
	
	Optional<User> getUserById(Integer id);
	User getUserByUsername(String username);
	void deleteUserById(Integer id);
//	UserDTO save(User user);
	
//	User findByUserNameOrEmail(String nombre, String email);
}
 