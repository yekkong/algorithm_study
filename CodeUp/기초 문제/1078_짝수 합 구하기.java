/*
	1078 - 짝수 합 구하기

	정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.

	예) 5 -> 6
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}

		System.out.println(sum);
	}
}