package com.callor.classes.exec;

import java.util.Scanner;

public class String2IntV5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�����Է� > ");
		
		/*
		 * scan.nextIn() �޼���� Enter ��ȣ�� ������
		 * nextLine()�� �����Ͽ� ������ nextLine()�� ������ ����Ų��
		 */
		// int intNum = scan.nextInt();
		String strNum = scan.nextLine();
		int intNum = 0;
		if(strNum.equals("")) {
			System.out.println("���ڸ� �Է��� �ּ���");
		} else {
			intNum = Integer.valueOf(strNum);
		}
		System.out.println("���ڿ� �Է� > ");
		String strValue = scan.nextLine();
		
		System.out.println("�Էµ� ���� : " + intNum);
		System.out.println("�Էµ� ���ڿ� : " + strValue);
	}
}
