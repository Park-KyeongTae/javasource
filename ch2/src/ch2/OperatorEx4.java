package ch2;

/* 연산자
 * 1) 단항연산자
 *    +(양수), -(음수), ++, --, ~, !
 * 2) 이항연산자
 *    산술 : +, -, *, /, %, <<, >>, >>> 
 *    비교 : >, <, >=, <=, ==(값이 같다면), !=(값이 같지 않다면)
 *    논리 : &&(and), ||(or), ^(xor), &(and), |(or)
 * 3) 삼항연산자 : ? :
 * 4) 대입연산자 : =    ex) a=4;
 * 
 * 
 * 연산자 우선순위
 * 5 + (3 * 4)
 */
public class OperatorEx4 {
	public static void main(String[] args) {
		// 조건 ? 참:거짓
		
		// 두 수를 비교해서 앞의 수가 크면 앞의 수를 변수에 담고
		// 뒤의 수가 크면 뒷수를 변수에 담기
		// 5 > 3 
		// 5 > 10
		// 5 > 3 ? 5 : 3
		// x > y ? x : y
		
		int x=5, y=10;
		int result = x > y ? x : y;
		System.out.println(result);		
	}
}















