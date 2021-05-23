package cu.desoft.desarrollo.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import cu.desoft.desarrollo.model.UsuarioEntity;


public interface UsuarioRepo extends JpaRepository<UsuarioEntity, Integer>{
	


}