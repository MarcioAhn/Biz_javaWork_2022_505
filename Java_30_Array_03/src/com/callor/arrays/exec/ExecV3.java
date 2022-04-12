package com.callor.arrays.exec;

public class ExecV3 {
	public static void main(String[] args) {
		
	
	int[] intNum1 = new int[100];
	
	int index = 0;
	for( index = 0 ; index < intNum1.length; index++) {
		intNum1[index] = (int)(Math.random() * 100) + 1;
	}
	
	// 짝수의 개수를 세어서 저장할 변수
	int intEvenCount = 0;
	for ( index = 0 ; index < intNum1.length; index++ ) {
		boolean bEven = (intNum1[index] % 2) == 0 ;
		if(bEven) {
			intEvenCount++;
			}
		
			
	}
	System.out.println("짝수개수 : " + intEvenCount);
		

	}
}