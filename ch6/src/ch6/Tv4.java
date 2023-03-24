package ch6;

// private : 외부 접근 불가
// final : 상수(대문자로 표현함)
// The blank final field VOLUME may not have been initialized
// 선언하면서 초기화를 한다
public class Tv4 {
	
	private String color; //색상
	private int channel;  //채널
	private boolean power;  //전원상태	
	
	final int VOLUME = 10; 
	
	
	public Tv4() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tv4(String color, int channel, boolean power) {
		super();
		this.color = color;
		this.channel = channel;
		this.power = power;
		//this.VOLUME = 15; //The final field Tv4.VOLUME cannot be assigned
	}

	void power() {
		power = !power;
	}	
	
	int channelUp() {
		channel++;
		return channel;
	}
	
	void channelDown() {
		channel--;
	}

	// getter/setter 메소드
	// getter : 변수의 값을 리턴하는 형태
	public String getColor() {
		return color;
	}
	// setter : 변수의 값을 변경하는 형태
	public void setColor(String color) {
		this.color = color;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}	
}




















