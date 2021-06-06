package cu.desoft.desarrollo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import cu.desoft.desarrollo.model.User;
import cu.desoft.desarrollo.repositorio.UserRepo;

@Service
public class UserService {

	private final UserRepo userRepository;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Autowired
	public UserService(UserRepo userRepository) {
		this.userRepository = userRepository;
	}

	public User getUserByUsername(String username) {

		return userRepository.getUserByUsername(username);
	}

	public User getUserById(Integer id) {

		return userRepository.getUserById(id)
				.orElseThrow(() -> new UsernameNotFoundException(id.toString() + " - not found in DB"));
	}

	public List<User> findAllUsers() {

		return (List<User>) userRepository.findAll();
	}

	public User addUser(User u) {
		return userRepository.save(u);
	}

	public User updateUser(User u) {

		return userRepository.save(u);
	}

	public void deleteUser(Integer id) {
		userRepository.deleteUserById(id);
	}

	public User save(User user) {
		User userNew = new User(null, "", "", null, null, null, false, false, null);
		userNew.setUsername(user.getUsername());
		userNew.setPassword(bcryptEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}

}
