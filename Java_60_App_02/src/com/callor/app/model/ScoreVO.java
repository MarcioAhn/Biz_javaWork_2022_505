package com.callor.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ScoreVO {

	protected String stName;
	protected int intKor;
	protected int intEng;
	protected int intMath;
	
	public int getIntSum() {
		
		int sum = intKor + intEng + intMath;
		return sum;
	}

	public float getAvg() {
		int sum = getIntSum();
		float avg = (float)sum / 3;
		return avg;
	}
	

	/*
	 * toString() method를 재정의 하여 한 학생의 성적리스트를 문자열로 return 하겠다
	 */
	public String toString() {
		
		String result = "";
		// 전체 10자리의 공간을 만들고 이름위치를 확보
		result += String.format("%-10s\t", stName);
		result += String.format("%5d\t", intKor);
		result += String.format("%5d\t", intEng);
		result += String.format("%5d\t", intMath);
		result += String.format("%5d\t", getIntSum());
		result += String.format("%5.2f\n", getAvg());
		return result;
	}
}
