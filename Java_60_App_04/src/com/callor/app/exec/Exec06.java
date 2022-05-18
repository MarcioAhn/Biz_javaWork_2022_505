package com.callor.app.exec;

/*
 * nums 배열에 10~100까지 정수를 저장하고 소수를 찾아 출력하시오
 */
public class Exec06 {

	public static void main(String[] args) {
		int[] nums = new int[100];
		int num = 0;
		for (int i = 0; i < nums.length; i++) {
			num = (int)(Math.random() * 91) + 10;
			nums[i] = num;
		}
		/*
		 * 배열 100개에 대하여 반복하면서 각 요소값에 대하여 2부터 요소값까지 반복하면서 index와 나머지 연산을 수행하여 0 나오면 break
		 * => 소수가 아니다 각 요소값이 소수이려면 index와 나머지 연산에서 한번도 0이 나오면 안된다 즉 if 조건이 한번도 true가
		 * 아니어야 하고 break가 실행되지 않아야 한다 break가 실행되지 않고 안쪽 for()가 완전 수행되면? 어떤일이 발생하는가를 보면
		 * 된다
		 */
		for (int j = 0; j < nums.length; j++) {
			int index = 0;
			// nums[j] 값이 9라고 했을 때
			// 2~8까지 반복실행된다
			for (index = 2; index < nums[j]; index++) {
				// 9 % 2 는 나머지가 1 , 9 % 3 은 나머지가 0이 된다
				// 9 % 3 이 0이 되는 순간 break를 만나서 for가 중단
				if (nums[j] % index == 0) {
					break;
				}
			} // for(index) end
				// 내부 break가 실행되면 여기로 탈출한다

			// break를 만나지 않았을 때는
			// nums[j] 값과 index 값이 같다
			// index 값이 같거나 큰가 비교해본다
			// true가 된다는 것은 break를 만나지 않았다는 것이다
			if (nums[j] <= index) {
				System.out.println(nums[j] + "는 소수");
			} else {
				System.out.println(nums[j] + "는 소수가 아님");
			}
		} // for(j) end
	}
}
