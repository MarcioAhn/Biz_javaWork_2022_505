package com.callor.app.domain;

public class ScoreVO {

	private int stNum;
	private int intKor;
	private int intEng;
	private int intMath;
	private int intSum;
	
	public int getIntSum() {
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		return intSum;
	}
	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}
	public int getStNum() {
		return stNum;
	}
	public void setStNum(int stNum) {
		this.stNum = stNum;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	@Override
	public String toString() {
		return "ScoreVO [stNum=" + stNum + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath
				+ ", intSum=" + intSum + "]";
	}

	
}
