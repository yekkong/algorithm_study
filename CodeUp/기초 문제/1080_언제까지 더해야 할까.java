/*
	1080 - 언제까지 더해야 할까?

	1, 2, 3...을 계속 더해 나갈 때,
	그 합이 입력한 정수(0 ~ 1000)보다 같거나 작을 때까지 계속 더하는 프로그램을 작성해보자.
	1, 2, 3, 4, 5...를 순서대로 계속 더해 합을 만들어가다가,
	입력된 정수와 같거나 커졌을 때, 마지막에 더한 정수를 출력한다.

	예) 55 -> 10
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int num = 1;

		while (sum + num < n) {
			sum += num;
			num++;
		}

		System.out.println(num);
	}
}