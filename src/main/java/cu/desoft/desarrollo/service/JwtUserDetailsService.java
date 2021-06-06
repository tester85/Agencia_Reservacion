package cu.desoft.desarrollo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import cu.desoft.desarrollo.model.User;
import cu.desoft.desarrollo.model.UserDTO;
import cu.desoft.desarrollo.repositorio.UserRepo;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("javainuse".equals(username)) {
			return (UserDetails) new User();
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);

		}
	}
	public User save(UserDTO user) {
		User userNew = new User();
		userNew.setUsername(user.getUsername());
		userNew.setPassword(bcryptEncoder.encode(user.getPassword()));
		return userRepo.save(userNew);
	}
}
