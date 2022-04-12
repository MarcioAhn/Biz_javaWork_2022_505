package com.callor.arrays.controller;

import com.callor.arrays.service.ServiceV1;
import com.callor.arrays.service.ServiceV1A;

public class ControllerV1 {
	public static void main(String[] args) {
		ServiceV1 serviceV1 = new ServiceV1();
		int intKorsum = serviceV1.scoreKorSum();
		System.out.println("총점 : " + intKorsum);
		
		ServiceV1A serviceV1A = new ServiceV1A();
		intKorsum = serviceV1A.scoreKorSum();
		System.out.println("총점 : " + intKorsum);
	}				
	
}
