package com.callor.var;

public class Var_02 {
	public static void main(String[] args) {
	
		int intNum1 = 0;
		intNum1 = num1();
		System.out.println(intNum1);
		
		/*
		 * 변수 값을 저장하는 방법 
		 * 1.숫자 직접 저장하는 방법 
		 * 2.다른 변수의 값 읽어서 저장하는 방법
		 * 3.명령을 수행해서 그 결과를 담는 방법
		*/					
		
		int intNum2 = 0;
		intNum2 = 33;
		intNum2 = intNum1;
		intNum2 = intNum1 + 100;
		
		intNum2 = add();
		/*
		 *  add() : add method라고 읽는다
		 *  add()를 실행(run, 명령을 수행)하여 그 결과를 inNum2에 저장해달라
		 */
	} // end main()
	
	
	//add()를 선언하기
	public static int add() {
		// 정수 55와 33을 덧셈하여 return 하기
		return 55 + 33;
		
	}
	
	/*
	 * num1()를 선언하기
	 */
	public static int num1() {
		return 100;
	// "public static int num1()" : num1 변수를 선언했다
	}
}

