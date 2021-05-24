package cu.desoft.desarrollo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cu.desoft.desarrollo.model.User;
import cu.desoft.desarrollo.repositorio.UserRepo;

@Service
public class UserService {

	private final UserRepo userRepository;

	@Autowired
	public UserService(UserRepo userRepository) {
		this.userRepository = userRepository;
	}

	public User getUserByNombre(String username) throws Exception {

		return userRepository.getUserByNombre(username);
	}	

	public User getUserById(Integer id){
		
		return  userRepository.getUserById(id).orElseThrow(()-> new UsernameNotFoundException(id.toString() + " - not found in DB"));		
	}

	public List<User> findAllUsers() throws Exception {

		return  (List<User>) userRepository.findAll();
	}

	public User addUser(User u) throws Exception {
		
		u.setId(Integer.valueOf(UUID.randomUUID().toString()));	
		return userRepository.save(u);
	}
	
	public User updateUser(User u) throws Exception {
		
		return userRepository.save(u);
	}
	
	public void deleteUser(Integer id) {
		userRepository.deleteUserById(id);
	}
	

}
