package shop2;

public class OrderMain {

	public static void main(String[] args) {
		// Orderdto 사용하기
		OrderDTO dto = new OrderDTO(); //인스턴스 생성
		
	//	OrderDTO dto1 = new OrderDTO(0, 0, 0, null, null, null);// 인스턴스 생성, 초기화
	//   setter 메소드 => 변경

		// 인스턴스 생성이 끝난 후
		// 초기화 => setter 메소드 사용
		// 프로퍼티에 값 세팅 (멤버변수, 속성) => 1) 생성자 2) setter 메소드 사용
		dto.setOrderId(1000);
		

		// 포함관계 객체를 한번 만들어야됨
//		dto.setUserDTO(new UserDTO(100, "hong", 1, "card"));

		UserDTO userDTO = new UserDTO();
		userDTO.setUserId(100);
		userDTO.setName("HONG");
		userDTO.setPayNo(1);
		userDTO.setType("CARD");
		
		
		dto.setUserDTO(userDTO); //위 세팅값을 OrderDTO에 있는 userDTO에 세팅 값을 넣는 작업
		
		// 프로퍼티 값 조회
		System.out.println(dto.getOrderId());
		System.out.println(dto.getUserDTO().getName());

		UserDTO getUser = dto.getUserDTO();
		System.out.println(getUser.getName());
		System.out.println(getUser.getType());
	}

}
