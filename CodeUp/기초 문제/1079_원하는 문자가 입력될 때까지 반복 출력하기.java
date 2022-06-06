/*
	1079 - 원하는 문자가 입력될 때까지 반복 출력하기

	'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.

	예) x b k d l q g a c ->
	x
	b
	k
	d
	l
	q
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == 'q') {
				System.out.println(c);
				break;
			}
			else {
				if (c != ' ') {
					System.out.println(c);
				}
			}
		}
	}
}