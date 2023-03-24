package ch6;

//상품관리

public class GoodsStock {
	//속성
	String code;    //상품코드(p123456)
	int stockNum;   //재고수량(200)
	
	//생성자를 하나도 명시하지 않으면
	//기본생성자를 알아서 생성해줌
//	public GoodsStock() {
//		// TODO Auto-generated constructor stub
//	}
		
	public GoodsStock(String code, int stockNum) {
		super();
		this.code = code;
		this.stockNum = stockNum;
	}
	
	
	//기능
	//재고수량 증가
	void addStock() {
		System.out.println("재고수량 증가");
	}
	//재고수량 감소
	void subtractStock() {
	
		System.out.println("재고수량 감소");
	}


	@Override
	public String toString() {
		return "GoodsStock [code=" + code + ", stockNum=" + stockNum + "]";
	}
	
	
}







