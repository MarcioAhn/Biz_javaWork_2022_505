package com.callor.app;

public class PaymentEx2 {

	public static void main(String[] args) {
		int pay = 3_829_980;
		int money = 50_000;
		int sw = 1;
		
		while(pay > 0) {
			
			int paper = pay / money;
			System.out.printf("%7d ��: %5d ��\n ", money, paper);
			pay -= paper * money;
			

			if(sw > 0) {
				money = money / 5;
			} else {
				money = money / 2;
			}
			sw = sw * (-1);
		}
	}
}
