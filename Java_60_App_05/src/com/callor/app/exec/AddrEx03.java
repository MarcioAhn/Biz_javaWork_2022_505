package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

/*
 * AddrEx03 에서 AddressVO 배열 3개를 선언 및 생성
 * 임의의 데이터를 저장하고
 * printAddrList()에 전달하여 출력
 */
public class AddrEx03 {

	public static void main(String[] args) {
		
		AddressVO[] addr = new AddressVO[3];
		
		addr[0] = new AddressVO();
		addr[1] = new AddressVO();
		addr[2] = new AddressVO();
		
		addr[0].setName("홍길동");
		addr[1].setName("이몽룡");
		addr[2].setName("성춘향");
		
		addr[0].setTel("010-111-1111");
		addr[1].setTel("010-111-1112");
		addr[2].setTel("010-111-1113");
		
		// addr[0] = AddressVO.builder().name("홍길동").tel("010-111-1111").build();
		
		AddrServiceV1 adService = new AddrServiceV1();
		adService.printAddrList(addr);
	
	}
}
