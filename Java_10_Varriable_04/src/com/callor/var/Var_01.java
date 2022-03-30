package com.callor.var;

public class Var_01 {

	public static void main(String[] args) {
				
			int intNum1 = 33;
			int intNum2 = 55;
			
			int intSum = intNum1 + intNum2;
			int intDe = intNum1 - intNum2;
			int intPro = intNum1 * intNum2;
			int intDi = intNum1 / intNum2;
			
			System.out.printf("\t%d + %d = %d\n", intNum1, intNum2, intSum); 
			System.out.printf("%d - %d = %d\n", intNum1, intNum2, intDe); 
			System.out.printf("%d x %d = %d\n", intNum1, intNum2, intPro); 
			System.out.printf("%d ÷ %d = %d\n", intNum1, intNum2, intDi); 
			/*
			 
			 
			//변수를 선언하고 claer(0을 저장, 대입)
			int intNum1 = 0;
			int intNum2 = 0;
			
			//변수에 값 저장하기
			//변수에 어떤 값을 저장하면 이미 저장된 값은? : 무조건 사라진다
			int intNum1 = 33;
			int intNum2 = 55;
			
			//4칙연산 결과를 저장(보관)하기 위한 변수 선언 clear
			int intSum = 0;
			int intDe = 0;
			int intPro = 0;
			int intDi = 0;
			
			// intNum1, intNum2 변수에 담긴 값을 읽어와서
			//4칙연산을 수행한 후 각각의 변수에 저장하기
			// 변수에 담긴 값을 읽어서 연산을 수행한 후 다른 변수에 저장하기
			int intSum = intNum1 + intNum2;
			int intDe = intNum1 - intNum2;
			int intPro = intNum1 * intNum2;
			int intDi = intNum1 / intNum2;
			
			// 화면에 변수를 만든 후 출력하기
			System.out.printf("\t%d + %d = %d\n", intNum1, intNum2, intSum); 
			System.out.printf("%d - %d = %d\n", intNum1, intNum2, intDe); 
			System.out.printf("%d x %d = %d\n", intNum1, intNum2, intPro); 
			System.out.printf("%d ÷ %d = %d\n", intNum1, intNum2, intDi); 
			
			*/
	
	}
}
