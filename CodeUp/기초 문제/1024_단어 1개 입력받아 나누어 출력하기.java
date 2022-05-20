/*
	1024 - 단어 1개 입력받아 나누어 출력하기

	단어 1개를 입력받아서 입력 받은 단어(영어)의 각 문자를 한줄에 한 문자씩 분리해 출력해보자.
	단어의 길이는 20자 이하이다.

	예)
	Boy가 입력되면
	'B'
	'o'
	'y'가 출력된다.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		for (int pos = 0; pos < input.length(); pos++) {
			char c = input.charAt(pos);
			System.out.println("'" + c + "'");
		}
	}
}