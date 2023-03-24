package ch6;

public class GoodsStockEx {
	public static void main(String[] args) {
		//티셔츠 상품관리
		//객체 생성 ==> 생성자 자동 호출
		// The constructor GoodsStock() is undefined
		GoodsStock goods = new GoodsStock("p123456",150); //매개변수를 가진 생성자 호출
		//초기화?
		
		System.out.println("현재 재고수량 "+goods.stockNum);
		
		//상품 판매 10 
		goods.subtractStock();
		

	}
}











