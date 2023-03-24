package inheritance.code;

//상속금지
public final class FinalTest {
	
	final int MAX_SIZE=10;  //상수
	
	static final int MIN_SIZE=0; //공유(공통)상수
	
	
	//오버라이딩 금지
	final void getMaxSize() {
		final int LV = MAX_SIZE; //상수		
	}
}
