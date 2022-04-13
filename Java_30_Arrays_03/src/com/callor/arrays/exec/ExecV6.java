package com.callor.arrays.exec;

public class ExecV6 {
	public static void main(String[] args) {
		int[] intNum1 = new int[100];
		String dLine = "=";
		String sLine = "-";

		for (int index = 0; index < intNum1.length; index++) {
			intNum1[index] = (int) (Math.random() * 100) + 1;
		}
		/*
		 * 짝수를 5번 출력하고 Enter를 출력하여 줄바꿈하기
		 * index 변수를 사용하여 횟수를 구분하면 홀수 일 때, 짝수 일 때 상관없이
		 * index값은 변화를 하기 때문에 문제가 발생한다
		 * 
		 * 짝수를 출력할때마다 출력한 횟수를 저장할 변수가 필요하다
		 * 별도로 짝수를 출력할때마다 출력한 횟수를 저장할 변수를
		 * for() 명령문 이전에 선언을 해주어여 한다
		 */
		int intEvencount = 0;
		System.out.println(dLine.repeat(100));
		System.out.println("짝수의 리스트");
		System.out.println(sLine.repeat(100));
		for (int index = 0; index < intNum1.length; index++) {
			boolean bEven = (intNum1[index] % 2) == 0;

			if (bEven) {
				System.out.printf(",%d\t", intNum1[index]) ;
				// 짝수를 출력한 후 출력한 횟수를 1 증가시키기
			intEvencount++;
			// 짝수를 출력한 횟수가 5가 되면 줄바꿈(println()) 한다	
			if ((intEvencount) % 5 == 0)
					System.out.println();
			}
		
	}
		System.out.println(dLine.repeat(100));
	}
}
		
