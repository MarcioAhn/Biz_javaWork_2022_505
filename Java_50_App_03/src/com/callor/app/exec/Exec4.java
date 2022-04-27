package com.callor.app.exec;

/*
 * 1 ~ 100까지 임의의 수를 생성하고
 * 그 수가 소수(prime number)인지 판별하시오
 */
public class Exec4 {
	public static void main(String[] args) {

		boolean isPrime = false;

		int num = (int) (Math.random() * 100) + 1;
		for (int i = 2; i < num; i++) {
			// 1과 num 자신 외에 나누어지는 수가 있는지 검사할 조건문
			if (num % i == 0) {
				// 나누어지는 수가 있을 경우 isPrime의 값을 true로 바꾼다.
				isPrime = true;
				// 한 번이라도 이 조건문이 실행될 경우 num은 소수가 아니므로 반복문을 빠져나온다.
				break;
			}
		}
		if (isPrime) {
			System.out.println(num + "은(는) 소수가 아닙니다.");
		} else {
			System.out.println(num + "은(는) 소수입니다.");
		}

	}
}
