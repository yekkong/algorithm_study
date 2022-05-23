/*
	1032 - 10진 정수 입력받아 16진수로 출력하기1

	10진수를 입력받아 16진수(hexadecimal)로 출력해보자.

	힌트: 10진수 형태로 입력받고 %x로 출력하면 16진수(hexadecimal) 소문자로 출력된다.

	예) 255 -> ff
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.printf("%x", n);
	}
}