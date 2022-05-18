package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;

public class Exec05 {

	public static void main(String[] args) {

		List<AddressVO> addrs = new ArrayList<>();

		AddressVO aVO = new AddressVO();
		aVO.setName("홍길동");
		aVO.setAge(30);
		addrs.add(aVO);

		addrs.add(AddressVO.builder().name("이몽룡").age(20).build());
		addrs.add(AddressVO.builder().name("성춘향").age(16).build());

		// 요소데이터가 아직 공백(blank) 객체를 list에 추가하고
		// 추가된 위치는 전체 리스트 size -1번 위치가 된다
		addrs.add(new AddressVO());

		// 리스트의 size 값을 확인하고
		int size = addrs.size();
		// 마지막에 추가된 데이터의 위치는 size -1이다
		// size -1위치의 객체 요소 값들을 setting
		addrs.get(size - 1).setName("임꺽정");
		addrs.get(size - 1).setAge(40);

		for (AddressVO vo : addrs) {
			System.out.println(vo.toString());
		}
		// 이름 순서로 오름차순 정렬

		System.out.println("=".repeat(50));
		for (AddressVO vo : addrs) {
			System.out.println(vo.toString());
		}
		System.out.println("=".repeat(50));
		
		size = addrs.size();
		
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++) {
				if ( addrs.get(i).getName().compareTo(addrs.get(j).getName()) > 0) {
					AddressVO _tVO = addrs.get(i);
					addrs.set(i, addrs.get(j));
					addrs.set(j, _tVO);
				}
			}
		}
		for( AddressVO vo : addrs) {
		System.out.println(vo.toString());
		}
	}
}
