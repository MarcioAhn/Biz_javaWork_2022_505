package com.callor.score.controller;

import com.callor.score.service.ScoreServiceV1;

public class ScoreControllerV1 {

	public static void main(String[] args) {
		String[] stNames = {"ȫ�浿","�̸���","������","�Ӳ���","�念��"};
		ScoreServiceV1 scService = new ScoreServiceV1(stNames);
		scService.makeScore();
		scService.printScore();
		scService.printSum();
	}
}
