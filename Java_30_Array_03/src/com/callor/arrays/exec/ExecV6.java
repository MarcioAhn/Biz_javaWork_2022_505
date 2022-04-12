package com.callor.arrays.exec;

public class ExecV6 {
	public static void main(String[] args) {
		int[] intNum1 = new int[100];
		String dLine = "=";
		String sLine = "-";

		for (int index = 0; index < intNum1.length; index++) {
			intNum1[index] = (int) (Math.random() * 100) + 1;
		}
		int intEvencount = 0;
		System.out.println(dLine.repeat(100));
		System.out.println("짝수의 리스트");
		System.out.println(sLine.repeat(100));
		for (int index = 0; index < intNum1.length; index++) {
			boolean bEven = (intNum1[index] % 2) == 0;

			if (bEven) {
				System.out.print(intNum1[index] + ",\t");
			}
			intEvencount++;
		}
		for (int index = 0; index < intNum1.length; index++) {
				if ((intEvencount) % 5 == 0)
					System.out.println();
			}
		
		System.out.println(dLine.repeat(100));
	}
}
