package ch3;


public class IfEx2 {
	public static void main(String[] args) {
		int jumsu=70;
		//지역변수 초기화 후 사용
		char grade=' '; // char : 문자 한개
		if(jumsu>=90) {
			grade='A';
		}else if(jumsu>=80) {
			grade='B';
		}else if(jumsu>=70) {
			grade='C';
		}else if(jumsu>=60) {
			grade='D';
		}else if(jumsu>=50) {
			grade='E';
		}else { //0~49
			grade='F';
		}
		System.out.println("점수 : "+jumsu+", 등급 : "+grade);

	}
}
