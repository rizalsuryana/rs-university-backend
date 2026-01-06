package zays.rsuniversity.entity;

import jakarta.persistence.*;
import lombok.*;
import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import zays.rsuniversity.dto.response.UserResponse;
import zays.rsuniversity.enums.UserRole;

import java.util.Collection;
import java.util.List;


@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User extends BaseEntity implements UserDetails {

	@Column(name = "user_name", nullable = false, unique = true)
	private String username;

	private String password;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(unique = true)
	private String email;

	@Column(name = "profile_picture")
	private String profilePicture;

	@Enumerated(EnumType.STRING)
	private UserRole role;

	@Column(nullable = false)
	private boolean enabled = true;


	//	overide from implements
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(new SimpleGrantedAuthority(role.getRoleName()));
	}

	@Override
	public @Nullable String getPassword() {
		return "";
	}

//	@Override
//	public String getUsername() {
//		return "";
//	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}


	//	* Helper
//	User response... profile response user coming soon
	public UserResponse toResponse() {

		return UserResponse.builder()
				.id(getId())
				.username(username)
				.email(email)
				.firstName(firstName)
				.lastName(lastName)
				.role(role)
				.profilePicture(profilePicture)
//				profile comingsoon
				.build();
	}


}
