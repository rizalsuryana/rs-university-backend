package zays.rsuniversity.enums;

import lombok.Getter;

public enum UserRole {
	ADMIN("ADMIN"),
	TEACHER("TEACHER"),
	STUDENT("STUDENT");

	@Getter
	private final String displayName;

	UserRole(String displayName) {
		this.displayName = displayName;
	}

	public String getRoleName() {
		return "ROLE_" + this.name();
	}
}
