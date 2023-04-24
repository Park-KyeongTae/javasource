package user.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	// 테이블과 똑같은 형태만들자
	// lombok 라이브러리 사용하자 
	private int no;
	private String userName;
	private int birthYear;
	private String addr;
	private String mobile;

}
