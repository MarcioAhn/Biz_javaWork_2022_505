package com.callor.arrays.service;

import com.callor.arrays.utils.Line;

/*
 * makeScore()
 * printScore()
 * sumScore()
 * 등의 method를 선언하고
 * 임의의 성적을 생성하여 intKor에 저장
 * 성적일람표 출력
 * 총점계산
 */
public class ScoreServiceV5 {
	private int[] intKor;
	private int[] intSum;

	public ScoreServiceV5() {
		intKor = new int[50];
	}


	public void makeScore() {

		for (int i = 0; i < intKor.length; i++) {
			intKor[i] = (int) (Math.random() * 100) + 1;
		}
	}

	public void printScore() {

		System.out.println(Line.dLine.repeat(50));
		System.out.println("성적일람표");
		System.out.println(Line.sLine.repeat(50));

		for (int i = 0; i < intKor.length; i++) {
			System.out.print(intKor[i] + "\t");
			if ((i + 1) % 4 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n");
		System.out.println(Line.dLine.repeat(50));

	}

	
	public void sumScore() {
		
		int intSum = 0;
		
		for (int i = 0; i < intKor.length; i++) {
			intSum += intKor[i];
			}
		System.out.println("총점 계산: " + intSum);
	}
}
