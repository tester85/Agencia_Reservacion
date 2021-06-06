package cu.desoft.desarrollo.model;

import java.io.Serializable;

public class JwtRequest implements Serializable {

	private static final long serialVersionUID = 5926468583005150707L;
	
	private String username;
	private String password;
	
	public JwtRequest()
	{
		
	}
	
	public JwtRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	private void setPassword(String password) {
		this.password = password;
		
	}

	private void setUsername(String username) {
		this.username = username;
		
	}
	

}
