package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

	public static void main(String[] args) {
		
		/*
		 * List(ArrayList) : 인터페이스를 이용하여 객체 선언하기
		 * java에서 배열을 대신하여 사용되는 자료형
		 * 여러가지 자료형 중에서 가장 많이 사용하는 구조
		 * List : Interface
		 * ArrayList : 구현클래스
		 */
		List<Integer> intList = new ArrayList<>();
		
		// 구현클래스만으로 객체를 선언하고 생성하는 코드를
		// 사용할 수는 있지만 Interface가 있는 경우는 
		// Interface를 사용하여 객체를 선언하는 것이 좋다
		ArrayList<String> strList = new ArrayList<>();
		
		// List 형의 자료는 저장(추가)할 데이터의 type을
		// Generic(제네릭)으로 설정한다
		// Generic으로 설정할 수 있는 type은
		// 반드시 class type이어야 한다
		// primitive type(ex)int num1 = 100;-혼자 값만 가짐)은 Generic으로 설정할 수 없다
		List<Float> floatList = new ArrayList<>();
		
	}
}
