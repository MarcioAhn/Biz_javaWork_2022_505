package com.callor.app.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.domain.StudentVO;
import com.callor.app.service.StudentService;
import com.callor.app.utils.IndexInfo;

public class StudentServiceImplV1 implements StudentService {

	private final List<StudentVO> stList;
	private final String stFileName;

	public StudentServiceImplV1() {
		List<StudentVO> sts = new ArrayList<>();
		this.stList = sts;
		this.stFileName = "";
	}

	public StudentServiceImplV1(List<StudentVO> stList, String stFileName) {
		this.stList = stList;
		this.stFileName = stFileName;

	}

	@Override
	public void loadStudent() {
		// is ��ü ����
		InputStream is = null;

		try {
			/*
			 *  stFileName ������ open �Ͽ� InputStream����
			 *  ��ȯ�� �� is ��ü�� ����
			 */
			is = new FileInputStream(this.stFileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(stFileName + "������ ã���� �����ϴ�");
			return;
		}
		/*
		 * file ������ ��� is ��ü�� Scanner�� ����
		 */
		Scanner fileRead = new Scanner(is);
		
		// scanner�� ���Ͽ� ������ �о����
		// ���Ͽ� ���� ������ �ִ��� Ȯ���ϸ鼭 while() �ݺ��� �����ϱ�
		while (fileRead.hasNext()) {
			// ���Ͽ��� �� ������ ���ڿ� �б�
			String stLine = fileRead.nextLine();
			
			// �о���� ���ڿ��� �ݷ�(:)�� �������� �����ϱ�
			// ���ص� ���ڿ����� ���ڿ� �迭�� ����� �����ϱ� 
			String[] stInfo = stLine.split(":");
			
			// ���ص� ���ڿ��� ��� �迭���� �� ��� ���� �о� ������ ���
			String stNum = stInfo[IndexInfo.ST.ST_NUM];
			String stName = stInfo[IndexInfo.ST.ST_NAME];
			String stDept = stInfo[IndexInfo.ST.ST_DEPT];
			String stGrade = stInfo[IndexInfo.ST.ST_GRADE];
			int intGrade = Integer.valueOf(stGrade);

			String stAddr = stInfo[IndexInfo.ST.ST_ADDR];
			String stTel = stInfo[IndexInfo.ST.ST_TEL];
			
			// �� ������ ��� �л������� ��ҵ��� VO ��ü�� ���
			// VO Ŭ������ �ʵ�����ڸ� ����Ͽ� ���� ��� stVO ����
			StudentVO stVO = new StudentVO(stNum, stName, intGrade, stDept, stAddr, stTel);
			
			// VO ��ü�� ��� �л��� ������ list�� �߰�
			stList.add(stVO);
		} // end while
		try {
			
			// ���� ������ �ݱ�
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ���� scanner resource �ݳ��ϱ�
		fileRead.close();
	}
	

	@Override
	public List<StudentVO> getStudents() {
		return this.stList;
	}

	@Override
	public StudentVO findByStNum(String stNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentVO> findByStName(String stName) {
		// TODO Auto-generated method stub
		return null;
	}
}
