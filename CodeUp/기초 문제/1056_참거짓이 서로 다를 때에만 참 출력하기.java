/*
	1056 - 참/거짓이 서로 다를 때에만 참 출력하기

	두 가지의 참(1) 또는 거짓(0)이 입력될 때, 참/거짓이 서로 다를 때에만 참을 출력하는 프로그램을 작성해보자.

	예) 1 1 -> 0
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a == b) {
			System.out.println(0);
		}
		else {
			System.out.println(1);
		}
	}
}