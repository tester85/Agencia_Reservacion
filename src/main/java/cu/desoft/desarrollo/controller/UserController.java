package cu.desoft.desarrollo.controller;

import static org.springframework.http.HttpStatus.OK;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cu.desoft.desarrollo.model.User;
import cu.desoft.desarrollo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> u = null;		
		try {
			u = userService.findAllUsers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return new ResponseEntity<List<User>>(u,OK);
	}
	
	@GetMapping("/home")
	public String ShowHomeUser() {
		return "Home user page";
	}
	  
	
	@GetMapping("/find/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") Integer id){
		User u = new User(); 
		try {			
			u = userService.getUserById(id);
		} catch (Exception e) {
			// TODO Error de conxion
			e.printStackTrace();
		}
		return new ResponseEntity<User>(u,OK);
	}

	@GetMapping("/search/{username}")
	public ResponseEntity<User> getUserById(@PathVariable("username") String username){
		User u = new User(); 
		try {			
			u = userService.getUserByUsername(username);
		} catch (Exception e) {
			// TODO Error de conxion
			e.printStackTrace();
		}
		return new ResponseEntity<User>(u,OK);
	}


	@PostMapping("/add")
	public ResponseEntity<User> addUser(@RequestBody User u){
			User data = u;
		try {
			userService.addUser(data);
			System.out.println("***************  " + u.getDescripcion());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<User>(u,OK);		
	}

	@PostMapping("/update")
	public ResponseEntity<User> updateUser(@RequestBody User u){
		try {
			userService.updateUser(u);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<User>(u,OK);		
	}

	@PostMapping("/delete/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable("id") Integer id){
		try {
			userService.deleteUser(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<>(OK);		
	}


}