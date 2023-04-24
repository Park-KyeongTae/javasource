package user.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor @NoArgsConstructor
@ToString @Setter @Getter
public class LoginDTO {
	private String userId;
	private String password;
}
