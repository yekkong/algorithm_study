/*
	1014 - 문자 2개 입력받아 순서 바꿔 출력하기

	2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		char b = sc.next().charAt(0);
		System.out.println(b + " " + a);
	}
}