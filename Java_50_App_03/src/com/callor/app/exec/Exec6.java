package com.callor.app.exec;

public class Exec6 {

	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 100) + 1;
		int iFlag = 0;
		
		for(int i = 0 ; i < num ; i++) {
			if(num % i == 0) {
				iFlag ++; // iFlag = 1
				break;
			}
		}
		// 브레이크가 있어야만 함
		if(iFlag == 0) {
			System.out.println(num + "는 소수");
		} else {
			System.out.println(num + "는 소수가 아님");
		}
		// 브레이크가 없어도 됨(안전한 조건검사)
		if(iFlag > 0) {
			System.out.println(num + "는 소수가 아님");
		} else {
			System.out.println(num + "는 소수");
		}
	}
}
