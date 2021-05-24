package cu.desoft.desarrollo.model;


import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="usuario")
public class User implements Serializable {	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)	
	private Integer id;
	
	
	@Column(name="nombre", nullable = false, unique = true)
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="rol")
	private Integer rol;
	
	@Column(name="password", nullable = false)
	private String password;
	
	@Column(name="email", nullable = false)
	private String email;
	
	public User() {
		
	}
	
	public User(Integer id, String nombre, String descripcion, Integer rol, String password, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.rol = rol;
		this.password = password;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer Id) {
		this.id = Id;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getRol() {
		return rol;
	}

	public void setRol(Integer rol) {
		this.rol = rol;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Usuario{"+
					"id="+ id + 
					", nombre=" + nombre + '\''+
					", descripcion=" + descripcion +'\''+ 
					", rol=" + rol + '\''+
					", password=" + password + '\''+ 
					", email" + email + '\''+
					'}';
	}
	
	
	
	

}
