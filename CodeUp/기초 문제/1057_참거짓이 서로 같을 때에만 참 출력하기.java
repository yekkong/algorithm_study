/*
	1057 - 참/거짓이 서로 같을 때에ㅐ만 참 출력하기

	두 개의 참(1) 또는 거짓(0)이 입력될 때, 참/거짓이 서로 같을 때에만 참이 계산되는 프로그램을 작성해보자.

	예) 0 0 -> 1
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a == b) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
}