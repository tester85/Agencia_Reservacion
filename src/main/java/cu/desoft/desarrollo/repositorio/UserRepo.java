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


/*

public interface userRepository extends JpaRepository<userEntity, Integer> {
		
	
	
	@Transactional()
	@Modifying
	@Query("update user set nombre = ?1 where id= ?2")
	int modifyById(String name, Integer Id);
	
	
	@Transactional()
	@Modifying
	@Query("delete from user where id= ?2")
	void deleteById(Integer Id);
	
	@Query("select u from user u where u.email = ?1")
	userEntity findByEmail(String email);
	
	@Query("select u from user u")
	List<userEntity> findAll(); 
	
}
*/