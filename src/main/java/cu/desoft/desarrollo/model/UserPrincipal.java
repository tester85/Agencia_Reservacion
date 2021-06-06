package cu.desoft.desarrollo.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserPrincipal implements UserDetails{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private User user;
	
	public UserPrincipal(User user) {
		//super();
		this.user = user;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		//Collection<GrantedAuthority> authorities = user.getAuthorities()).collect(Collectors.toList());  
		//a = this.user.getAuthorities().stream().map(SimpleGrantedAuthority::new);
		
		//return authorities.stream(this.user.getAuthorities()).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
		return null;//.map(SimpleGrantedAuthority::new).collect(Collectors.toList());
	}
	

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return user.isNotLocked();
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return user.isActive();
	}

}
