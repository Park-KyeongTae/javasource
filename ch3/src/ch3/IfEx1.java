package ch3;

public class IfEx1 {
	public static void main(String[] args) {
		// 조건 : true/false 판별되어야 함
		// i==0, i>0, i!=10...  i%2==0
//		if(조건) {
//			//블럭 실행 여부는 조건이 true 일 때만
//		}
		
//		int num =0;
//		//num 값이 0이라면 num=0 출력하기
//		if(num==0) {
//			System.out.println("num=0");
//		}
//		
//		//num 값이 0이 아니라면 num!=0 출력하기
//		if(num!=0) {
//			System.out.println("num!=0");
//		}
//		
		
		
//		if(조건) {
//			//블럭 실행 여부는 조건이 true 일 때만
//		}else {
//			//false일 때
//		}
		
//		//score가 60이상이면 합격 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.println("점수 입력");
//		int score=Integer.parseInt(sc.nextLine());//		
//		if(score>=60) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}
		
		//성적 90이상일 때 A, 성적이 80 이상일 때 B, 70 C.....
		
//		if(조건) {
//			//조건1 true 일 때
//		}else if(조건2){
//			//조건2 true일 때
//		}else if(조건3) {
//			//조건3 true일 때
//		}
		
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
		}
		System.out.println("점수 : "+jumsu+", 등급 : "+grade);
	}
}
