/*
	1013 - 정수 2개 입력받아 그대로 출력하기

	정수(int) 2개를 입력받아 그대로 출력해보자.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a + " " + b);
	}
}