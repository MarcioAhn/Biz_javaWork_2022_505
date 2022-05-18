package com.callor.app.exec;

public class Exec02 {

	public static void main(String[] args) {

		int[] nums = new int[10];

		// 배열에 값을 채워넣는 부분
		for (int i = 0; i < nums.length; i++) {
			int num = (int) (Math.random() * 100) + 1;
			nums[i] = num;
			System.out.println(num);
		}
		// 연산하는 부분
		int count = 0;
		int evenSum = 0;
		for (int i : nums) {
			if( i % 2 == 0) {
				
			
			count++;
			evenSum += i;
		}
			
		}
		System.out.println("짝수 갯수: " + count);

		System.out.println("짝수 합계 : " + evenSum);
	}

}
