package com.callor.app.primes;
/*
 * 100개 배열하고 소수 판별하기
 */
public class Exec8 {

	public static void main(String[] args) {
		int[] nums = new int[100];
		for (int i = 0; i < nums.length; i++) {
			int num = (int) (Math.random() * 100) + 2;
			nums[i] = num;
		}
		int count = 0;
		// 배열 전체 요소 개수만큼 반복하기
		for (int i = 0; i < nums.length; i++) {

			int index = 0;
			
			// 배열의 i번째 요소에 저장된 수가 소수인가 판별
			for (index = 2; index < nums[i]; index++) {
				if (nums[i] % index == 0) {
					break;
				}

			}
			// 배열의 i 번째 요소가 소수이면 count 증가
			// if( index <= nums[i])
			if (!(index < nums[i])) {
				count++;

			}
		}
		System.out.println("소수의 개수 : " + count);

	}
}
