package com.callor.app.exec;

import java.util.List;

import com.callor.app.GetValue;
/*
 * ������ ����Ʈ�� �����ϰ�
 * 1~100������ ������ ���� 100���� �����Ͽ� �߰�
 * ����Ʈ�� ��� ������ ��
 * "���� ū ��"�� ��Ÿ���� ��ġ�� ���� �Բ� ���
 */
public class Exec5 {

	public static void main(String[] args) {
		List<Integer> nums = GetValue.getList(100);
		int lastIndex = 0;
		int max = 0;
		for(int i = 0 ; i < nums.size() ; i++) {
			int num = nums.get(i);
			if( num > max) {
				max = num;
				lastIndex = i;
			}
		}
		System.out.printf("%d��° %d\n",lastIndex,max);
		System.out.printf("%d��° %d\n",lastIndex,nums.get(lastIndex));
		// max ���� ��ġ�ϴ� ������ ���
		int index = nums.indexOf(max);
		System.out.println("���� ū ���� ���� ó�� ��Ÿ�� ��ġ :" + index);

		
	}
}
