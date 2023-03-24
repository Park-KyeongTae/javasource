package ch6;
/* 메소드 작성
 * 특정 작업을 수행하는 일련의 문장들을 하나로 묶어 놓은 거
 * 수학 함수와 유사
 * 
 * 리턴(반환)타입 메소드명(){}
 * 리턴(반환)타입 메소드명(타입 변수명,.....){}
 * void, 앞에서 사용했던 변수 타입 다 가능, 배열 가능, 
 */
public class Tv2 {
	//속성(property)  ==> 멤버변수
	//크기, 길이, 높이, 색상, 볼륨, 채널.....
	String color; //색상
	int channel;  //채널
	boolean power;  //전원상태
	
	//기능(function) ==> 메서드
	//켜기, 끄기, 볼륨 높이기, 볼륨 낮추기, 채널 변경....
	// void : 메소드 실행이 끝난 후 그냥 돌아감(리턴값 없음)
	void power() {
		power = !power;
	}
	
	// 채널을 증가하고 현재 채널을 리턴
	// int : 메소드가 실행이 끝난 후 int 값을 가지고 돌아감
	int channelUp() {
		channel++;
		return channel;
	}
	
	void channelDown() {
		channel--;
	}
	
	
	
	
}






