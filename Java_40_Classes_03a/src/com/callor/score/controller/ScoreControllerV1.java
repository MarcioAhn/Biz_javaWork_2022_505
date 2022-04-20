package com.callor.score.controller;

import com.callor.score.service.ScoreServiceV1;

public class ScoreControllerV1 {

	public static void main(String[] args) {
		String[] stNames = {"È«±æµ¿","ÀÌ¸ù·æ","¼ºÃáÇâ","ÀÓ²©Á¤","Àå¿µÀÚ"};
		ScoreServiceV1 scService = new ScoreServiceV1(stNames);
		scService.makeScore();
		scService.printScore();
		scService.printSum();
	}
}
