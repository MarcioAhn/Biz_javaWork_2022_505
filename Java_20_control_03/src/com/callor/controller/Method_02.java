package com.callor.controller;

public class Method_02 {
	public static void main(String[] args) {
		 
		int intResult1 = add();
		int intResult2 = multi();
		
		System.out.println(intResult1 + intResult2);
		
	}
	public static int add() {
		int intNum1 = (int)(Math.random() * 100 + 1);
		int intNum2 = (int)(Math.random() * 100 + 1);
		return (intNum1 + intNum2);
	}
		
	public static int multi() {
		int intNum1 = (int)(Math.random() * 100 + 1);
		int intNum2 = (int)(Math.random() * 100 + 1);
		return (intNum1 * intNum2);	
		
	}
}
