/*
	1050 - 두 정수 입력받아 비교하기2

	두 정수(a, b)를 입력받아 a와 b가 같으면 1을, 같지 않으면 0을 출력하는 프로그램을 작성해보자.

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