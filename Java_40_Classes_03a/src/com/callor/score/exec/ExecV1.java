package com.callor.score.exec;

import com.callor.score.domain.ScoreVO;
import com.callor.score.utils.Line;

public class ExecV1 {

	public static void main(String[] args) {
		
		// ScoreVO Ŭ������ ����Ͽ� 3���� ��ü�� ����
		ScoreVO stNo1 = new ScoreVO();
		ScoreVO stNo2 = new ScoreVO();
		ScoreVO stNo3 = new ScoreVO();
		
		stNo1.stName = "ȫ�浿";
		stNo2.stName = "�̸���";
		stNo3.stName = "������";
		
		stNo1.intKor = 90;
		stNo2.intKor = 88;
		stNo3.intKor = 100;
		
		// 1�� �л��� �̸��� ���������� Ȯ���ϰ� �ʹ�
		System.out.println(Line.dLine(50));
		System.out.println("���� ó��");
		System.out.println(Line.sLine(50));
		System.out.printf("%s\t%d\n", stNo1.stName, stNo1.intKor);
		System.out.printf("%s\t%d\n", stNo2.stName, stNo2.intKor);
		System.out.printf("%s\t%d\n", stNo3.stName, stNo3.intKor);
		System.out.println(Line.dLine(50));
	}
}
