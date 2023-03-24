package ch6;

public class NumbersEx {
	public static void main(String[] args) {
		//배열생성
		int num[]= {10,15,25,36,55,95};
		
		
		Numbers numbers = new Numbers(num);
		System.out.println("배열총합"+numbers.getTotal());
		System.out.println("배열평균"+numbers.getAverage());
		

	}
}
