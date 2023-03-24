package ch6;

import java.util.Scanner;

public class GoodsStockEx2 {
	public static void main(String[] args) {
		// 입력값으로 GoodsStock 인스턴스 생성
		Scanner sc = new Scanner(System.in);

//		System.out.print("상품코드 >> ");
//		String code = sc.nextLine();		
//		System.out.print("재고수량 >> ");
//		int stockNum = Integer.parseInt(sc.nextLine());
//		
//		GoodsStock stock = new GoodsStock(code, stockNum);
//		System.out.println(stock);
		
		
		
		
		// 3개의 상품에 대해서 인스턴스를 생성해야 한다면?
//		System.out.print("상품코드 >> ");
//		code = sc.nextLine();		
//		System.out.print("재고수량 >> ");
//		stockNum = Integer.parseInt(sc.nextLine());
//		
//		GoodsStock stock1 = new GoodsStock(code, stockNum);
//		System.out.println(stock1);
//		
//		System.out.print("상품코드 >> ");
//		code = sc.nextLine();		
//		System.out.print("재고수량 >> ");
//		stockNum = Integer.parseInt(sc.nextLine());
//		
//		GoodsStock stock2 = new GoodsStock(code, stockNum);
//		System.out.println(stock2);
//		
//		System.out.print("상품코드 >> ");
//		code = sc.nextLine();		
//		System.out.print("재고수량 >> ");
//		stockNum = Integer.parseInt(sc.nextLine());
//		
//		GoodsStock stock3 = new GoodsStock(code, stockNum);
//		System.out.println(stock3);
		
		GoodsStock[] goods = new GoodsStock[3];
//		goods[0] = new GoodsStock("p1001", 200);
//		goods[1] = new GoodsStock("p1002", 150);
//		goods[2] = new GoodsStock("p1003", 250);
//		위 세줄의 코드를 입력값으로 변경
		
		for (int i = 0; i < goods.length; i++) {
			System.out.print("상품코드 >> ");
			String code = sc.nextLine();		
			System.out.print("재고수량 >> ");
			int stockNum = Integer.parseInt(sc.nextLine());
			goods[i] = new GoodsStock(code, stockNum);
			System.out.println("--------------------------------");
		}
		
		// 확인용
		for (int i = 0; i < goods.length; i++) {
			System.out.println(goods[i]);			
		}
		
		for(GoodsStock good:goods) {
			System.out.println(good);
		}		
	}
}











