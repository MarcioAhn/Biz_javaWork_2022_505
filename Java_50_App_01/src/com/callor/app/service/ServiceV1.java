package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;

public class ServiceV1 {

	// final : 이 변수는 딱 한번만 값을 저장할 수 있다
	// 하지만 class type의 변수는 그러하지 않은 경우도 있다
	// class type의 변수에 final을 선언하는 이유는
	// 한번 초기화된 변수를 다시 초기화 하지 못하도록 하는 것이다
	// 특히 List type과 같이 많은 데이터를 저장하는 변수들은
	// final로 선언하는 것을 적극 권장한다
	private final List<Integer> intList;
	private final int num;
	
	// final로 선언된 변수는 반드시 생성자(public ServiceV1(){})에서 초기화한다
	public ServiceV1() {
		intList = new ArrayList<>();
		num = 0; // 사용 준비 완료
	}
	// 일반적인 변수는 기억장치에 이름이 붙고 어떤 값을 추가하면 값이 저장
	// 원래 있던 변수는 사라지고 대체 된다(직접 메서드에 추가)
	// Integer로 만든 변수는 기억장치에 이름이 붙고 
	// 주소가 저장되는 공간(여러 메서드가 존재하는)이 만들어져
	// 그 공간에 저장하고 기억장치에는 주소가 저장된다(직접 메서드가 추가되는 게 아님)
	
	// intList에 10개의 배열 추가하기
	public void makeScore() {
		// num = 10;
		for(int i = 0 ; i < 10 ; i++ ) {
			Integer rnd = (int)(Math.random() * 100) + 1;
			intList.add(rnd);
		}
		// intList는 final로 선언되어 있기 때문에
		// 다시 초기화 할 수 없다 => 'private final로 한 이유'
		// intList = new ArrayList<>();
	}
	public List<Integer> getIntList() {
		return intList;
	}
}
