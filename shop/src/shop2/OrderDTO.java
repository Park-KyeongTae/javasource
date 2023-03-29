package shop2;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

//관계 : 1. 상속(is a), 2. 포함(has a)

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @ToString
public class OrderDTO {
	 private int orderId; //기본타입 소문자
	 private int userId; //기본타입 소문자
	 private int productId; //기본타입 소문자
	 private Date orderDate; //참조타입 대문자
	 
	 
	 //포함관계
	 private UserDTO userDTO; //참조타입 대문자
	 private ProductDTO productDTO; //참조타입 대문자

}
     // 인스턴스 생성 => 힙 메모리에 자리를 잡고 사용할 수 있는 상태가 됨
	 // OrderDTO가 가지고 있는 프로퍼티(멤버변수),메소드 호출이 가능하다.
	 // 원하는 값을 세팅
     // 참조타입 객체생성 =>1) new
	 //               2) setter
