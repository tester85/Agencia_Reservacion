package agencia.desarrollo.desoft.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="usuario")
public class Person {

	private final UUID id;
	
	@Column(name="name", nullable = false, unique = true)
	private final String name;
	
	@Column(name="email", nullable = false)
	private String email;
	
	@Column(name="active", nullable = false)
	private boolean active;
	
	public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name, @JsonProperty("email") String email, @JsonProperty("active") boolean active) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.active = active;
	}
	
	/**
	 * @return the id
	 */
	public UUID getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
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

	

}
