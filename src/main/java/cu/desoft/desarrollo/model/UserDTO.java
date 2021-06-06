package cu.desoft.desarrollo.model;

public class UserDTO {
	private String username;
	private String descripcion;
	private String[] rol; // Role_User 1-Admin 2-User
	private String password;
	private String email;
	private boolean isNotLocked;
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the rol
	 */
	public String[] getRol() {
		return rol;
	}
	/**
	 * @param rol the rol to set
	 */
	public void setRol(String[] rol) {
		this.rol = rol;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
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
	private boolean active;
}
