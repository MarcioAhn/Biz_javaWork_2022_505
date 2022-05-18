package com.callor.app.service;

import java.util.List;

import com.callor.app.model.AddressVO;

public class AddrServiceV1 {

	// AddressVO type의 매개변수 1개를 받기
	public void printAddr(AddressVO vo) {
		System.out.println(vo.toString());

	}

	// AddressVO 배열 type의 매개변수 1개 받기
	// 배열의 갯수만큼 AddressVO가 전달된다
	public void printAddrList(AddressVO[] addr) {
		for (AddressVO vo : addr) {
			// 객체만 println()에 전달하면
			// 내부에서 vo.toString()을 호출하여 문자열을 받아 출력(.toString()없어도됨)
			System.out.println(vo.toString());
		}
		for (int i = 0; i < addr.length; i++) {
			System.out.println(addr[i].toString());
		}
	}
	// List로 매개변수 1개 받기
	public void printAddrList(List<AddressVO> addr) {
		// List는 출력방법 3가지!
		for( AddressVO vo : addr ) {
			
			System.out.println(vo.toString());
		}
		int size = addr.size();
		for(int i = 0 ; i < size ; i++) {
			System.out.println(addr.get(i));
		}
		for(int i = 0 ; i < size ; i++) {
			AddressVO adVO = addr.get(i);
			System.out.println(adVO);
		}
	}
	
}
