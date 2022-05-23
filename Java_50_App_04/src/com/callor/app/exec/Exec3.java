package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;
/*
 * 정수형 리스트를 생성
 * 1~100까지 임의의 정수 100개를 생성하여 추가
 * 리스트에 담긴 정수들 중 
 * 55 이상의 정수가 "가장 첫번째로"나타난 경우를 찾아서
 * 위치와 값을 함께 출력
 */
public class Exec3 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for(int i = 0 ; i < 100 ; i++) {
			nums.add((int)(Math.random() * 100) + 1);
		}
		int index = 0;
		for(int num : nums) {
			if(num >= 55) {
				System.out.printf("최초로 %d 번째 %d", index+1, num);
				break;
			}
			index++;
		}
	}
}
