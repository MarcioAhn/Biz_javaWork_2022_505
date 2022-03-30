package com.callor.var;

public class Var_06 {
	public static void main(String[] args) {
		
		int intAge = (int)(Math.random() * 100) + 10;
		
		String strName = "홍길동";
		
		// '%d-정수형' '%f-실수형' '%s-문자열'
		System.out.printf("\t%s 의 나이는 %d 이다\n", strName, intAge);
	}
}
