package com.callor.arrays;

public class ArraysV5 {
	public static void main(String[] args) {
		
		
		int[] intScore = new int[100];
		int index = 0;
		for(index = 0; index < intScore.length; index++) {
		intScore[index] = (int)(Math.random() * 100) + 1;
		}
		/*
		 * intScore 배열에 담긴 값을 for()문을 사용하여
		 * 각 요소별로 한 줄로 출력 하다가
		 * 5번째 요소를 출력한 후 Enter(new line, println())를 하라
		 * i(index) 값을 5로 나눈 0이 될 때 println()을 실행하여 new line을 부여한다
		 * 그런데 index값은 0부터 시작한다 0 % 5 의 결과는 0이 되어
		 * 처음 요소를 출력한 후 new line이 되어 버린다
		 * 그래서 i+1을 먼저 실행하여 index % 5 의 연산을 1부터 시작하도록 해준다
		 */
		for(index = 0; index < intScore.length; index++) {
			System.out.print(intScore[index] + ",\t");
			if((index+1) % 5 == 0) {
			System.out.println();
			}
		}		
		
	}	
	
}