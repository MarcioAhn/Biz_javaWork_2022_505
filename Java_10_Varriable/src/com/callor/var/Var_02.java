package com.callor.var;

public class Var_02 {
		public static void main(String[] args) {
		
		int num1 = 100;
		int num2 = 200;
		
		int num3 = 0;
		int num4 = 0;
		// 변수에 값을 저장(대입,할당)하거나
		// 읽으려면 반드시 이전에 변수가
		// 최소한 선언되어 있어야 한다.
		num3 = 200;
		num4 = 300;
		System.out.println(num3 + num4);
		//출력문 앞에 있는 마지막 변수로 출력된다(덮어쓰기) 
		int num5 = 100;
		num5 = 0;
		num5 = 1000;
		System.out.println(num5);
		num5 = 99;
		num5 = -1;
		System.out.println(num5);
		
	}
}