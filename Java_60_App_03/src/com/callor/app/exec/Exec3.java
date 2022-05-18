package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

/*
 * 정수형 배열 10개를 선언낳고
 * 1~100까지 임의의 정수를 생성하여 배열에 저장
 * 배열의 리스트를 보여주고
 * 배열에 저장된 정수들의 합을 구하여 console에 출력
 */
public class Exec3 {

	public static void main(String[] args) {
		int[] nums = new int[10];
		int intSum = 0;
		float fAvg = 0f;
		for (int i = 0; i < nums.length; i++) {
			int num = (int) (Math.random() * 100) + 1;
			nums[i] = num;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		for (int i = 0; i < nums.length; i++) {
			intSum += nums[i];
		}
			System.out.println("정수들의 합 : " +intSum);
			
			fAvg = (float)intSum/ nums.length;
		 System.out.println("정수들의 평균 : " + fAvg);
		}
	}

