package com.callor.app.controller;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV1;

public class ScoreController {

	public static void main(String[] args) {
		 
		ScoreService scS = new ScoreServiceImplV1();
		scS.makeScore();
	}
}
