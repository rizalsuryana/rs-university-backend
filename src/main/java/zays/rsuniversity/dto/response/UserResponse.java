package zays.rsuniversity.dto.response;

import lombok.*;
import zays.rsuniversity.enums.UserRole;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse {
	private Long id;
	private String username;
	private String email;
	private String firstName;
	private String lastName;
	private UserRole role;
	private String profilePicture;
}
