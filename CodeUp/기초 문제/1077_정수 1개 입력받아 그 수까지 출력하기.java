/*
	1077 - 정수 1개 입력받아 그 수까지 출력하기

	정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 출력해보자.

	예) 4 ->
	0 
	1
	2
	3
	4
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			System.out.println(i);
		}
	}
}