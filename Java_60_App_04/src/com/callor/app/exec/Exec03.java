package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.BookVO;

public class Exec03 {
	
	public static void main(String[] args) {
	List<BookVO> bookList = new ArrayList<>();
	
	// 1개의 bookVO를 만들고 
	BookVO bookVO = new BookVO();
	for(int i = 0 ; i < 10; i++) {
		bookVO.setTitle("Do it 자바");
		// 같은 bookVo를 list에 10번 추가하기
		// 모든 list의 주소가 동일한 상태
		// 가장 마지막에 저장한 값으로 모두 통일되버림
		bookVO.setComp("이지즈퍼블리시");
		bookList.add(bookVO);
		System.out.println(bookVO);
		
	}
	for(int i = 0 ; i < 10; i++) {
		// bookVO1 을 10번 다시 생성
		BookVO bookVO1 = new BookVO();
		bookVO1.setTitle("Do it 자바");
		bookVO1.setComp("이지즈퍼블리시");
		bookList.add(bookVO1);
		
		System.out.println(bookVO1);
	}
	}
}
