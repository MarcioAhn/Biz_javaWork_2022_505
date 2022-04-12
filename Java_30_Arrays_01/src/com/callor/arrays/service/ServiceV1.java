package com.callor.arrays.service;

public class ServiceV1 {
	public int scoreKorSum() {
		
		int korscore1 = 0;
		int korscore2 = 0;
		int korscore3 = 0;
		int korscore4 = 0;
		int korscore5 = 0;
		
		korscore1 = (int)(Math.random() * 100) + 1;
		korscore2 = (int)(Math.random() * 100) + 1;
		korscore3 = (int)(Math.random() * 100) + 1;
		korscore4 = (int)(Math.random() * 100) + 1;
		korscore5 = (int)(Math.random() * 100) + 1;
		
		int intSum = korscore1;
		intSum += korscore2;
		intSum += korscore3;
		intSum += korscore4;
		intSum += korscore5;
		
		return intSum;
	}

}
