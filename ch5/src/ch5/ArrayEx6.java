package ch5;

import java.util.Arrays;

public class ArrayEx6 {
	public static void main(String[] args) {
		// 로또번호
		int[] ball = new int[45];
		
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i+1;
		}
		
		System.out.println(Arrays.toString(ball));

		for (int i = 0; i < 6; i++) {
			//0~44 범위의 값 얻기
			int n = (int)(Math.random()*45); 
			int temp = ball[i];
			ball[i] = ball[n];
			ball[n] = temp;
			
		}
		
		//앞 자리 6개 출력
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i]+" ");
		}
	}
}









