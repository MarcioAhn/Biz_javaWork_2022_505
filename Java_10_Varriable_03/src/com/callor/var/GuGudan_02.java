package com.callor.var;

public class GuGudan_02 {
	public static void main(String[] args) {
		
		int intDan = 8;
		int intIndex = 1;
		
		/*
		 * printf()
		 * 미리 출력할 모양을 만들고("%d x %d = %d")
		 * 뒤에 나열된 값을 순서대로 %d 대신 부착하여 Console에 출력하기
		 * 
		 * 양식(form)을 미리 만들고 form 모양에 따라 값을 출력하는 용도의
		 * method
		 * 
		 * "\n": println 처럼 출력후 줄바꿈하기
		 * "\t": 키보드의 Tab키를 누른 것처럼 간격을 띄우기
		 * "%d": 정수형 숫자를 표현하는 기호
		 */
		System.out.printf("\t%d x %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d x %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d x %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d x %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d x %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d x %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d x %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d x %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d x %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d x %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d x %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d x %d = %d\n", intDan, intIndex, intDan * intIndex++);
		System.out.printf("\t%d x %d = %d\n", intDan, intIndex, intDan * intIndex++);
	}
}
