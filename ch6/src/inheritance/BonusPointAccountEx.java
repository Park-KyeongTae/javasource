package inheritance;

public class BonusPointAccountEx {
	public static void main(String[] args) {
		
		// 예금액 : 100000
		// 현재보너스포인트 : 10점
		BonusPointAccount bonusPointAccount = new BonusPointAccount("110-22","홍길동",0, 0);
		
		// 예금액
		int amount = 100000;
		bonusPointAccount.deposit(amount);
		
		System.out.println("예금액 : "+amount);
		System.out.println("현재 보너스 포인트 : "+bonusPointAccount.getBonusPoint());
	}
}
