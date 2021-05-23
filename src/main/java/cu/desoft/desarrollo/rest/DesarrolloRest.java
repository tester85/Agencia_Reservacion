package cu.desoft.desarrollo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
public class DesarrolloRest {
	
	@Autowired
	private UsuarioRepo repo;

	@GetMapping("/listar")
	public String Listado(Model model) {
		
		return null;
		
	}
	
	@GetMapping("/nombre")
	public String nombre() {
		return "Daichel";
	}
	
	@GetMapping("/description")
	public String description() {
		return "Probando la descripcion";
		}



}
