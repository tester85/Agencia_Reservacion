package cu.desoft.desarrollo.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="usuario")
public class User implements Serializable {	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Integer id;
	
	
	@Column(name="username", nullable = false, unique = true)
	private String username;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="rol")
	private String[] rol; // Role_User 1-Admin 2-User
	
	@Column(name="password", nullable = false)
	@JsonIgnore
	private String password;
	
	@Column(name="email", nullable = false)
	private String email;
	
	@Column(name="isNotLocked", nullable = false)
	private boolean isNotLocked;
	
	@Column(name="active", nullable = false)
	private boolean active;
	
	private String[] authorities; 
	
	public User() {
		
	}
	
	public User(Integer id, String username, String descripcion, String[] rol, String password, String email, boolean isNotLocked,boolean active, String[] authorities) {
		super();
		this.id = id;
		this.username = username;
		this.descripcion = descripcion;
		this.rol = rol;
		this.password = password;
		this.email = email;
		this.isNotLocked = isNotLocked;
		this.active = active;
		this.authorities = authorities;
		}

	
	public String getUsername() {
		return username;
	} 

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String[] getRol() {
		return rol;
	}

	public void setRol(String[] rol) {
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
	
	/**
	 * @return the isNotLocked
	 */
	public boolean isNotLocked() {
		return isNotLocked;
	}

	/**
	 * @param isNotLocked the isNotLocked to set
	 */
	public void setNotLocked(boolean isNotLocked) {
		this.isNotLocked = isNotLocked;
	}

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * @return the authorities
	 */
	public String[] getAuthorities() {
		return authorities;
	}

	/**
	 * @param authorities the authorities to set
	 */
	public void setAuthorities(String[] authorities) {
		this.authorities = authorities;
	}

	public String toString() {
		return "Usuario{"+
					"id="+ id + 
					", username=" + username + '\''+
					", descripcion=" + descripcion +'\''+ 
					", rol=" + rol + '\''+
					", password=" + password + '\''+ 
					", email" + email + '\''+
					'}';
	}
	
	
	
	

}
