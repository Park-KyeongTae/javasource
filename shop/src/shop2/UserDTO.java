package shop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 생성자, getter/setter ,toString ==> 롬복 라이브러리(프로젝트 포함)

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {
	private int userId;
	private String name;
	private int payNo;

	// card, cash 정보 담을 변수
	private String type;
}
