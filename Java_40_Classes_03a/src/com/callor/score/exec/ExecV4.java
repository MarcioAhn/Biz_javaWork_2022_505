package com.callor.score.exec;

import com.callor.score.domain.ScoreV2VO;

public class ExecV4 {

	public static void main(String[] args) {
		
		
		// ScoreV2VO Ŭ������ ����Ͽ� 100�� �迭��ü ����
		ScoreV2VO[] scores = new ScoreV2VO[100];
		// �迭��ü ��� ��Ҹ� for() �ݺ��� ������ �����ڸ� ȣ���Ͽ� �ʱ�ȭ
		for(int i = 0 ; i < scores.length; i++) {
			scores[i] = new ScoreV2VO();
		}
	}
}
