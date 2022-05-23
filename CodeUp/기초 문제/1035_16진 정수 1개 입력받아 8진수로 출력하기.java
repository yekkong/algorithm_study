/*
	1035 - 16진 정수 1개 입력받아 8진수로 출력하기

	16진수로 입력된 정수 1개를 8진수로 바꾸어 출력해보자.
	16진수는 영문 소문자로 입력된다.

	예) f -> 17
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(16);
		System.out.printf("%o", n);
	}
}