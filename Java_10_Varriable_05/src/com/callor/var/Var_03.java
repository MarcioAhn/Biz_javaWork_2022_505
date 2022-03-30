package com.callor.var;

public class Var_03 {
	public static void main(String[] args) {
		
		double douNum1 = 0;
		double douNum2 = 0;
		
		// doNum1 : 0.0000 ~ 0.9999 범위의 실수가 생성되어 저장
		douNum1 = (Math.random());
		
		/*
		 * Math.random()이 실행된 결과가 담긴 douNum1 변수의 값에
		 * 1000을 곱하여 다시 douNum1에 저장하라
		 * douNum1 = douNum1 * 1000;과 같다
		 * douNum1: 0.000 ~ 999.999 범위의 실수가 저장
		 */
		douNum1 *= 1000;
		/*
		 * douNum1에 담긴 값에 1을 더하여 다시 douNum1에 저장
		 * douNum1: 1.000 ~ 1000.999 범위의 실수가 저장
		 */
		douNum1 ++;
		
		// 정수값으로 변환
		// intNum1: 1 ~ 1000 범위의 정수가 저장
		int intNum1 = (int)douNum1;
		
		douNum2 = (Math.random() * 1000 + 1);
		int intNum2 = (int)douNum2;
		
		int intSum = intNum1 + intNum2;
		int intDe = intNum1 - intNum2;
		int intPro = intNum1 * intNum2;
		int intDi = intNum1 / intNum2;
		
		System.out.printf("\t%d + %d = %d\n", intNum1, intNum2, intSum);
		System.out.printf("\t%d - %d = %d\n", intNum1, intNum2, intDe);
		System.out.printf("\t%d x %d = %d\n", intNum1, intNum2, intPro);
		System.out.printf("\t%d / %d = %d\n", intNum1, intNum2, intDi);
	}
}
