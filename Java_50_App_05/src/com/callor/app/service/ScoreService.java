package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.domain.ScoreVO;
import com.callor.app.utils.Line;

public class ScoreService {

	private List<ScoreVO> scList;

	public ScoreService() {
		scList = new ArrayList<>();
	}

	public void makeScore() {

		for (int i = 0; i < 20; i++) {
			ScoreVO scVO = new ScoreVO();
			scVO.setStNum(i + 1);
			int kor = (int) (Math.random() * 50) + 51;
			int eng = (int) (Math.random() * 50) + 51;
			int math = (int) (Math.random() * 50) + 51;
			scVO.setIntKor(kor);
			scVO.setIntEng(eng);
			scVO.setIntMath(math);
			scList.add(scVO);
		}

	}

	public void printScore() {
		System.out.println(Line.dLine(50));
		System.out.println("학번\t국어\t영어\t수학\t총점");
		System.out.println(Line.sLine(50));
		for (ScoreVO scVO : scList) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\n", scVO.getStNum(), scVO.getIntKor(), scVO.getIntEng(),
					scVO.getIntMath(), scVO.getIntSum());
		}
		System.out.println(Line.dLine(50));
	}

	public void printSum() {
		System.out.print("총  점\t");

		int intKorsum = 0;
		int intEngsum = 0;
		int intMathsum = 0;
		int intAllsum = 0;

		for (ScoreVO scVO : scList) {
			int sum = 0;
			intKorsum += scVO.getIntKor();
			intEngsum += scVO.getIntEng();
			intMathsum += scVO.getIntMath();
			intAllsum = intKorsum + intEngsum + intMathsum;
		}
		System.out.print(intKorsum + "\t");
		System.out.print(intEngsum + "\t");
		System.out.print(intMathsum + "\t");
		System.out.print(intAllsum + "\t");

	}
}
