package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	/*
	 * 생성자 패턴
	 * 클래스 영역(필드영역)에서 변수, 객체 배열 등을 선언만 하고
	 * private 으로 접근제한을 하고
	 * 객체와 배열은 final로 선언하고
	 * (java에서는 기본, spring 임의)생성자 method에서
	 * 선언된 변수를 초기화(생성, 사용할 준비)를 한다
	 */
	protected final List<ScoreVO> scoreList;
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<>();
	}

	@Override
	public void makeScore() {
		for(int i = 0 ; i < 10 ; i++ ) {
			int intKor = (int)(Math.random() * 51) + 50;
			int intEng = (int)(Math.random() * 51) + 50;
			int intMath = (int)(Math.random() * 51) + 50;
			
			
			ScoreVO sc = new ScoreVO();
			sc.setIntKor(intKor);
			sc.setIntEng(intEng);
			sc.setIntMath(intMath);
			scoreList.add(sc);
			System.out.println(sc);
			
		}
	
		}
	

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sumScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void avgScore() {
		// TODO Auto-generated method stub

	}

}