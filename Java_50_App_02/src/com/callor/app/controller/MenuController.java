package com.callor.app.controller;

import java.util.Scanner;

import com.callor.app.utils.Line;

public class MenuController {
	
	private final int lineLength;
	private final Scanner scan;
	// �����ڿ��� �ʱ�ȭ��Ű�� ���� ǥ��
	public MenuController() {
		lineLength = 50;
		scan = new Scanner(System.in);
	}
	
	public void viewMainMenu() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("����� �л���� 2022");
		System.out.println(Line.sLine(lineLength));
		System.out.println("1. �л����� ����");
		System.out.println("2. �������� ����");
		System.out.println("QUIT : ���� ����");
		System.out.println(Line.sLine(lineLength));
		System.out.print("������ �����ϼ��� >> ");
	}
	
	public void viewStMenu() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("�л����� ����");
		System.out.println(Line.sLine(lineLength));
		System.out.println("1. �л����� Loading");
		System.out.println("2. �л����� ��ü����");
		System.out.println("3. �й����� �˻��ϱ�");
		System.out.println("4. �̸����� �˻��ϱ�");
		System.out.println("QUIT : Main Menu�� ����");
		System.out.println(Line.sLine(lineLength));
		System.out.print("���� ���� >> ");
	}
	
	public void viewScMenu() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("�������� ����");
		System.out.println(Line.sLine(lineLength));
		System.out.println("1. �������� Loading");
		System.out.println("2. ��ü ��������Ʈ ����");
		System.out.println("3. �й����� �˻��ϱ�");
		System.out.println("4. �̸����� �˻��ϱ�");
		System.out.println("QUIT : Main Menu�� ����");
		System.out.println(Line.sLine(lineLength));
		System.out.print("���� ���� >> ");
	}
	
	// Integer�� return�� null�� ����
	public Integer selectMenu() {
		
		
		String strKey = scan.nextLine();
		if(strKey.equals("QUIT")) {
			return -1;
		}
		Integer intKey = 0;
		try {
			intKey = Integer.valueOf(strKey);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
		return intKey;
	}
}
