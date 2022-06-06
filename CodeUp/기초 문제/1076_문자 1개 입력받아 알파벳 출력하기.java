/*
	1076 - 문자 1개 입력받아 알파벳 출력하기

	영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자.

	예) f -> a b c d e f
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char input = sc.nextLine().charAt(0);
		char c = 'a';

		while (c <= input) {
			System.out.print(c + " ");
			c++;
		}
	}
}