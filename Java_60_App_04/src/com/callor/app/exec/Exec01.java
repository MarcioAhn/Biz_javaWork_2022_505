package com.callor.app.exec;
/*
 * 다음 코드가 오류가 나지 않도록 클래스와 method를 생성
 */
public class Exec01 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		Call call = new Call();
		int sum = call.add(num1,num2);
		System.out.println("두 수의 합계 : " + sum);
		
		
	}
	
}
