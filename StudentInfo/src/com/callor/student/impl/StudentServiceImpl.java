package com.callor.student.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.model.StudentVO;
import com.callor.student.service.StudentService;
import com.callor.utils.Line;

public class StudentServiceImpl implements StudentService {

	private final String fileName;
	private final List<StudentVO> stdList;

	public StudentServiceImpl() {
		this("src/com/callor/student/model/student.txt");
	}

	public StudentServiceImpl(String fileName) {
		this.fileName = fileName;
		stdList = new ArrayList<>();
	}

	public void loadStudent() {
		InputStream is = null;
		Scanner fileScan = null;

		try {
			is = new FileInputStream(fileName);
			fileScan = new Scanner(is);
			while (fileScan.hasNext()) {
				String line = fileScan.nextLine();
				String[] sts = line.split(":");

				StudentVO stVO = StudentVO.builder().num(sts[0]).name(sts[1]).dept(sts[2])
						.grade(Integer.valueOf(sts[3])).tel(sts[3]).build();

				stdList.add(stVO);

			}
		} catch (FileNotFoundException e) {
			System.out.println(fileName + "파일이 없습니다.");
			return;
		}

	}

	@Override
	public void inputStudent() {
		while(true) {
			
			
		}
		
			StudentVO stVO = new StudentVO();
			stVO.setNum("S0001");
			stVO.setName("홍길동");
			stVO.setDept("컴퓨터공학과");
			stVO.setNum("1");
			stVO.setTel("010-111-1111");
			stdList.add(stVO);
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);
        scanner.close();
    }

	

	@Override
	public void printStudent() {
		System.out.println(Line.dLine(50));
		System.out.println("학생정보");
		System.out.println(Line.sLine(50));
		System.out.println("학번\t이름\t학과\t학년\t전화번호");
		System.out.println(Line.sLine(50));
		for (StudentVO stVO : stdList) {
			System.out.println(stVO.getNum() + "\t");
			System.out.println(stVO.getName() + "\t");
			System.out.println(stVO.getDept() + "\t");
			System.out.println(stVO.getGrade() + "\t");
			System.out.println(stVO.getTel() + "\t");
		}
		System.out.println(Line.dLine(50));
	}

	public void saveStudent() {
		FileWriter file = null;
		PrintWriter out = null;
		try {
			file = new FileWriter(fileName);
			out = new PrintWriter(file);
			for (StudentVO stVO : stdList) {
				out.print(stVO.getNum() + ":");
				out.print(stVO.getName() + ":");
				out.print(stVO.getDept() + ":");
				out.print(stVO.getGrade() + ":");
				out.print(stVO.getTel() + ":");
			}
			out.flush();
			out.close();
			file.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
