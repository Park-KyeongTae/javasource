package inheritance.code;

import modifier.Account; 


public class Modifer1 {
	// 참조타입은 null 로 세팅
	//String str=new String("Hello");
//	String str="Hello";
	
	Account acc=new Account();  //The type modifier.Account is not visible(public 이 생략되면)
	
	int age; // 기본타입은 정수형-0, 실수형-0.0, boolena-false으로 세팅
	
	private void print() {	
		
		//Account가 가지고 있는 ano 접근하고 싶다면?
		String ano=acc.getAno();
		System.out.println("ano : "+ano);
		
		acc.setAno("111-22");
		System.out.println("ano : "+acc.getAno());
	}
	
	public static void main(String[] args) {
		// static 메소드에서 non-static 메소드 호출하기
		// 1. 같은 static 으로 만들기
		// 2. 객체 생성 후 접근하기
		Modifer1 modifer1 = new Modifer1();
		modifer1.print();
		
		
	}
}










