package com.callor.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.domain.StudentVO;
import com.callor.app.service.StudentService;
import com.callor.app.service.impl.StudentServiceImplV1;
import com.callor.app.utils.Line;

public class StudentControllerV1 {
	private final Scanner scan;
	private final MenuController menu;
	private final StudentService stService;
	private final List<StudentVO> stList;

	public StudentControllerV1() {
		scan = new Scanner(System.in);
		menu = new MenuController();
		
		String stFileName = "src/com/callor/app/data/student.txt";
		stList = new ArrayList<>();
		stService = new StudentServiceImplV1(stList,stFileName);
	}

	public Integer selectMenu() {

		while (true) {
			menu.viewStMenu();
			String strKey = scan.nextLine();
			if (strKey.equals("QUIT")) {
				return -1;
			}
			Integer intKey = 0;
			try {
				intKey = Integer.valueOf(strKey);
			} catch (Exception e) {
				System.out.println("������ �ٽ� �����ϼ���");
				continue;
			}
			if (intKey == 1) {
				System.out.println("�л� �ε�...");
				stService.loadStudent();
				System.out.println("�л����� ������ ��� �о����ϴ�..");
			} else if (intKey == 2) {
				// ��ü �л�����Ʈ ���̱�
				List<StudentVO> stList = stService.getStudents();
				if(stList.size() < 1) {
					System.out.println("�л����� ������ ���� �ε��ϼ���");
					continue;
				}
				System.out.println(Line.dLine(50));
				System.out.println("�л� ���� ����Ʈ");
				System.out.println(Line.sLine(50));
				System.out.println("�й�\t�̸�\t�а�\t�г�\t��ȭ��ȣ\t�ּ�");
				System.out.println(Line.sLine(50));
				for(StudentVO vo : stList) {
					System.out.print(vo.getStNum()+"\t");
					System.out.print(vo.getStName()+"\t");
					System.out.print(vo.getStDept()+"\t");
					System.out.print(vo.getIntGrade()+"\t");
					System.out.print(vo.getStTel()+"\t");
					System.out.println(vo.getStAddr());
				}
				System.out.println(Line.dLine(50));
				
			} else if (intKey == 3) {
				System.out.println("�й� �˻��ϱ�");
			} else if (intKey == 4) {
				System.out.println("�̸� �˻��ϱ�");
			} else {
				System.out.println("1 ~ 4 �߿��� �����ϼ���");
			} // end if
		} // end while
	} // end selectMenu

}
