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
/*
@PostMapping(path = "/add") 
public @ResponseBody String addNewUser() {
	User n = new User();
	n.setNombre("Pepe");
	n.setEmail("pepe@desoft.cu");
	n.setRol(1);	
	n.setDescripcion("description");
	n.setPassword("a");
	try {
		userRepository.addUsuario(n);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	return "Saved";
}

@GetMapping(path = "/all")
public @ResponseBody Iterable<User> getAllUsers() {
	// This returns a JSON or XML with the users
	try {
		return userRepository.findAll();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null; 
}

@GetMapping("/error")
public String error() {
	return "Error";
}

@GetMapping("/nombre")
public String nombre() {
	return "Daichel";
}

}

 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Repository; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody;
 * 
 * import cu.desoft.desarrollo.model.UsuarioEntity; import
 * cu.desoft.desarrollo.service.UsuarioService;
 * 
 * @Repository public class UsuarioController {
 * 
 * @Autowired UsuarioService userservice;
 * 
 * @GetMapping("/nombre") public String nombre() { return "Daichel"; }
 * 
 * @GetMapping("/description") public String description() { return
 * "Probando la descripcion"; }
 * 
 * @PostMapping("/usuario/add") public void addUsers(@RequestBody UsuarioEntity
 * user) { try { userservice.addUsers(user); } catch (Exception e) {
 * e.printStackTrace(); } }
 * 
 * 
 * @GetMapping("/usuario/{id}") public UsuarioEntity
 * getUserById(@PathVariable("id") Integer id) { UsuarioEntity user = null; try
 * { System.out.println("***************  " + id); user =
 * userservice.getUserById(id); } catch (Exception e) { e.printStackTrace(); }
 * return user; }
 * 
 * 
 * @GetMapping(value = "/users") public List<UsuarioEntity> getAllUser() {
 * List<UsuarioEntity> user = new ArrayList<UsuarioEntity>();
 * System.out.println("***************  "); try { user =
 * userservice.getAllUsers(); } catch (Exception e) { e.printStackTrace(); }
 * return user; }
 * 
 * 
 * }
 */