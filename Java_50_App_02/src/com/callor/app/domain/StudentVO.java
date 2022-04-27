package com.callor.app.domain;

/*
 * Ŭ���� ����(class prototype define)
 * java������ �����ϰ�
 * class Ű���带 �������� ���� �ڵ�
 */

public class StudentVO {
	
	/*
	 * VO Ŭ������ �⺻�����ڿ�
	 * ��� �ν��Ͻ�����(Ŭ���������� ����)��
	 * �Ű������� �޾� �ʱ�ȭ �ϴ� ���ǻ����ڸ� �����
	 * 
	 * JDK�� ����Ͽ� ������Ʈ�� ������ ��
	 * �پ��� �������� ������ �ʿ䰡 �ִµ�
	 * �����鸶�� VO ��ü�� ��ü�� �����ϴ� ����� ���ݾ� �ٸ���
	 * 
	 * � ������ getter, setter�� ���Ͽ� �����ϱ⵵ �ϰ�
	 * � ������ �ʵ�����ڸ� ���Ͽ� �����ϱ⵵ �Ѵ�
	 * 
	 * �ֱٿ��� getter, setter�� ������ ���ڶ�� �ǰ��� ������
	 * �پ��� JDK ������ ����� ���� �ʿ��ϹǷ�
	 * ǥ�� Java �ڵ��� VO Ŭ������ �ۼ� ���Ͽ�����
	 * ��� ������ private���� �����ϰ� getter, setter�� ������ �ش�
	 */
	

	private String stNum;
	private String stName; 
	private int intGrade;
	private String stDept;
	private String stAddr;
	private String stTel;

	public StudentVO() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param stNum
	 * @param stName
	 * @param intGrade
	 * @param stDept
	 * @param stAddr
	 * @param stTel
	 */
	public StudentVO(String stNum, String stName, int intGrade, String stDept, String stAddr, String stTel) {
		super();
		this.stNum = stNum;
		this.stName = stName;
		this.intGrade = intGrade;
		this.stDept = stDept;
		this.stAddr = stAddr;
		this.stTel = stTel;
	}
	

	public String getStNum() {
		return stNum;
	}


	public void setStNum(String stNum) {
		this.stNum = stNum;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public int getIntGrade() {
		return intGrade;
	}

	public void setIntGrade(int intGrade) {
		this.intGrade = intGrade;
	}

	public String getStDept() {
		return stDept;
	}

	public void setStDept(String stDept) {
		this.stDept = stDept;
	}

	public String getStAddr() {
		return stAddr;
	}

	public void setStAddr(String stAddr) {
		this.stAddr = stAddr;
	}

	public String getStTel() {
		return stTel;
	}

	public void setStTel(String stTel) {
		this.stTel = stTel;
	}
	
	
	// VO ��ü�� �����͸� ������ ��
	// ����� �����Ͱ� ������ �� ������ Ȯ���ϴ� �뵵�� ����ϱ� ���Ͽ�
	// toString() �޼��带 ������ �Ѵ�
	@Override
	public String toString() {
		return "StudentVO [stNum=" + stNum + ", stName=" + stName + ", intGrade=" + intGrade + ", stDept=" + stDept
				+ ", stAddr=" + stAddr + ", stTel=" + stTel + "]";
	}
}
