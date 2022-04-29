package com.callor.app.controll;

import com.callor.app.service.ScoreService;

public class ScoreController {

	public static void main(String[] args) {
		ScoreService scService = new ScoreService();
		scService.makeScore();
		scService.printScore();
		scService.printSum();
	}
	
}
