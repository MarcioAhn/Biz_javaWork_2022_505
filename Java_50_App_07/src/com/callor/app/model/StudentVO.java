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
@NoArgsConstructor // 기본 생성자
@Builder
public class StudentVO {

	private String stNum;
	private String stName;
	private String stTel;
	private String stAddr;
	private String stDept;
	private int stGrade;
}