package com.callor.var;

public class Var_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0;
		
		/*
		 * ����++ �Ǵ� ++���� ��
		 * �ܵ����� ���ɶ��� �������� �Ȱ���
		 */
		++num1;
		num1++;
		/*
		 * ������ �ٸ� ��ɹ� �ȿ��� ���ɶ���
		 * ������ �ſ� �޶� ���� ���Ǹ� �ؾ� �Ѵ�
		 * ++����: ���� ���� ����Ǵ� ����� �ȴ�
		 * ����++: ��� ����� �� ����ǰ� ������ ��ɹ����� �����ϱ� ������
		 * 			����ȴ�
		 */
		System.out.println(++num1);
		System.out.println(num1++);
		num1 = 0;
		num1 = ++num1 * 3;
		System.out.println(num1);
		
		num1 = 0;
		num1 = num1++ * 3;
		System.out.println(num1);
	}

}
