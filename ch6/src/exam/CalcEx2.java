package exam;

import java.util.Scanner;

public class CalcEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Num1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("Input Num2 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("Input operator : ");
		String op = sc.nextLine();
		
		//Calc calc = null;
		int result = 0;
		switch (op) {
		case "+":
			Add calc = new Add();
			calc.setValue(num1, num2);
			result = calc.calculate();
			break;
		case "-":
			Sub calc1 = new Sub();
			calc1.setValue(num1, num2);
			result = calc1.calculate();
			break;
		case "*":
			Mul calc2 = new Mul();
			calc2.setValue(num1, num2);
			result = calc2.calculate();
			break;
		case "/":
			Div calc3 = new Div();
			calc3.setValue(num1, num2);
			result = calc3.calculate();
			break;
		}
		System.out.println("결과 "+result);
	}
}








