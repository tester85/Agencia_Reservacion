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
@RequestMapping("/User")
public class UserController {
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	/*@GetMapping
	public ResponseEntity<List<User>> getAllUsers(){
		try {
			userService.findAllUsers();
			 System.out.println("***************  " );
		} catch (Exception e) {
			// TODO Error de conxion
			e.printStackTrace();
		}
		return (ResponseEntity<List<User>>) userService.findAllUsers();;
	}
	*/
	// Probando con una lista para obtener los datos en vez de la respuesta HTTP
	@GetMapping
	public List<User> getAllUsers(){
		
		try {
			return	userService.findAllUsers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") Integer id){
		try {
			userService.getUserById(id);
		} catch (Exception e) {
			// TODO Error de conxion
			e.printStackTrace();
		}
		return new ResponseEntity<User>(OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<User> addUser(@RequestBody User u){
		try {
			userService.addUser(u);
			 System.out.println("***************  " + u.getDescripcion());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<User>(OK);		
	}
	
	@PostMapping("/update")
	public ResponseEntity<User> updateUser(@RequestBody User u){
		try {
			userService.updateUser(u);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<User>(OK);		
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