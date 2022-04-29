package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

/*
 * 정수형 리스트를 생성
 * 1~100까지 임의의 정수 100개를 생성하여 추가
 * 리스트에 담긴 정수들 중 
 * 55 이상의 정수가 "가장 마지막으로"나타난 경우를 찾아서
 * 위치와 값을 함께 출력
 */
public class Exec4 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			nums.add((int) (Math.random() * 100) + 1);
		}
		int lastIndex = 0;
//		int lastValue = 0;
//		int size = nums.size();
//		for (int i = 0; i < size; i++) {
//			int num = nums.get(i);
//			if (num >= 55) {
//				lastIndex = i;
//				lastValue = num;
//			}
//		}
//		System.out.printf("%3d 번째 %3d", lastIndex, lastValue);
//
//	}
		lastIndex = 0;
		int size = nums.size();
		for (int i = 0; i < size; i++) {
			int num = nums.get(i);
			if (num >= 55) {
				lastIndex = i;
			}
		}
		System.out.printf("%3d 번째 %3d", lastIndex, nums.get(lastIndex));

		// for() index를 역순으로 진행하기
		for (int i = size - 1; i > -1; i--) {
			if (nums.get(i) >= 55) {
				System.out.printf("%3d 번째 %3d", i, nums.get(i));
				break;
			}
		}

	}
}