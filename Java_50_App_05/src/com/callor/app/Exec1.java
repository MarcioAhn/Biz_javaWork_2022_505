package com.callor.app;
/*
 * random()메서드를 사용하여 25~50의 정수를 생성하고 주문할 피자 판수를 계산하는 코
 */
public class Exec1 {

	public static void main(String[] args) {
		// 25 ~ 50까지 정수생성하기
		int num = (int)(Math.random() * 25 ) + 25;
		int pizza = 6;
		
		/*
		 * 피자가 한판에 6조각
		 * 피자를 부족하지 않도록 먹기 위해서
		 * 최소 몇판의 피자가 필요한가
		 * 
		 * 인원수 / 피자수로 나누었을 때
		 * 그 결과가 0이거나 최소 1이상 이어야 한다
		 */
		if(num % pizza == 0) {
			System.out.printf("인원 %d 는 %d의 피자가 필요", num, num/pizza);
		} else {
			int pan = (num / pizza) + 1;
			System.out.printf("인원 %d는 %d의 피자가 필요", num, pan);
		}
		
		
//		int[] num = new int[1];
//		for(int i = 0; i < num.length ; i++) {
//			int piz = 0;
//			num[i] = (int)(Math.random() * 25) + 25;
//			if( num[i] <= 30   ) {
//				piz = 5;
//			} else if(num[i] <= 36 ) {
//				piz = 6;
//			} else if(num[i] <= 42 ) {
//				piz = 7;
//			} else if(num[i] <= 48 ) {
//				piz = 8;
//			} else {
//				piz = 9;
//			}
//			System.out.println("학생수 : " + num[i]);
//			System.out.println("주문 피자 판수 : " + piz);
//		}
	}
}
