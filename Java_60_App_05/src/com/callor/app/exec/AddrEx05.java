package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

/*
 * AddrEx04에서 List<AddressVO> 선언 및 생성
 * 임의의 데이터를 3개 추가하고
 * printAddrList()에 전달하여 출력
 * 
 * service.AddrServiceV1 클래스에서
 * printAddrList() method를 선언
 * AddressVO List를 매개변수로 받아 리스트를 출력
 */
public class AddrEx05 {

	public static void main(String[] args) {
		
		/*
		 * List : interface, 데이터 그룹을 저장하기 위한 type
		 * 		Collections type
		 * 다수의 데이터를 저장하고 연산에 사용하기 위한 데이터 type
		 * List를 선언할 때는 Generic type을 지정한다
		 * 		1. List에 add 하는 데이터를 제한하여 
		 * 		잘못된 데이터가 add 되는 것을 방지하기 위함
		 * 		2. 메모리 낭비를 막고 성능상 이점이 있기 때문에
		 * 아래 선언된 List는 Generic type이 AddressVO 이다
		 * 여기 List에 데이터를 추가하려면 먼저 AddressVO type의
		 * 		vo 객체를 만들고 데이터를 저장한 다음 add 한다
		 */
		List<AddressVO> addr = new ArrayList<>();
		
		AddressVO adVO = new AddressVO();
		
		
		adVO.setName("홍길동");
		adVO.setTel("010-111-1111");
		adVO.setAge(33);
		addr.add(adVO);
		
		/*
		 * 중요@ VO 데이터를 List에 add하기 위해서는
		 * 항상 새로운 VO를 생성하고 데이터를 setting하고 add 해야한다
		 */
		adVO = new AddressVO();
		adVO.setName("이몽룡");
		adVO.setTel("010-111-1112");
		adVO.setAge(19);
		addr.add(adVO);
		
		adVO = new AddressVO();
		adVO.setName("성춘향");
		adVO.setTel("010-111-1113");
		adVO.setAge(16);
		addr.add(adVO);
		
		AddrServiceV1 adService = new AddrServiceV1();
		// 3명의 데이터 출력하기
		adService.printAddrList(addr);
		System.out.println("=".repeat(100));
		adVO = AddressVO.builder()
					.name("임꺽정")
					.tel("010-111-1114")
					.age(45)
					.build();
		
		// addr 리스트의 2번째 데이터를 임꺽정 데이터로 변경하고 싶다
		// addr.add(AddressVO) : 데이터를 추가하기
		addr.set(2, adVO);
		adService.printAddrList(addr);
		
		/*
		 * AddrEx05에서 List<AddressVO>에 3명의 데이터가 저장되어 있다
		 * 이 데이터를 나이순으로 오름차순 정렬하고
		 * printAddrList() method에 전달하여 출력
		 * 
		 */
		adService.printAddrList(addr);
		
		//나이를 오름차순으로 정렬하기.

		
		
	}
}
