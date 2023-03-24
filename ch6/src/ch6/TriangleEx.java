package ch6;

public class TriangleEx {
	public static void main(String[] args) {
		//객체 생성 => 초기화
		Triangle triangle = new Triangle(15,7);
		
				
		//메소드 호출
		System.out.println("삼각형 넓이 "+triangle.getArea());

	}
}
