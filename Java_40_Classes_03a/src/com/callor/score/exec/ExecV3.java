package com.callor.score.exec;

import com.callor.score.domain.ScoreV2VO;

public class ExecV3 {

	public static void main(String[] args) {
		
		// VOŬ������ ����Ͽ� �迭 �����ϱ�
		ScoreV2VO[] scores = new ScoreV2VO[10];
		
		// �迭�� ����� ��ü�� ���� ����� �غ� �� �Ǿ���
		// �� ��ҵ��� �ݵ�� �����ڷ� �ʱ�ȭ �����־�� �Ѵ�
		scores[0] = new ScoreV2VO();
		scores[1] = new ScoreV2VO();
		scores[2] = new ScoreV2VO();
		scores[3] = new ScoreV2VO();
		
		scores[0].setStName("ȫ�浿");
		scores[1].setStName("�̸���");
		scores[2].setStName("�念��");
		scores[3].setStName("������");
	}
}
