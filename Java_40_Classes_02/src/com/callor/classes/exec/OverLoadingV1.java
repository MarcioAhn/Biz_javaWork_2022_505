package com.callor.classes.exec;

public class OverLoadingV1 {

	// args가 다르면 같은 method 사용해도 오류 발생 X
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	public float add(float num1, float num2) {
		return num1 + num2;
	}
	public long add(long num1, long num2) {
		return num1 + num2;
	}
}
