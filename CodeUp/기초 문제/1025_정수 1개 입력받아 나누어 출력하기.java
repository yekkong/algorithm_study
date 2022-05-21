/*
	1025 - 정수 1개 입력받아 나누어 출력하기

	다섯 자리의 정수 1개를 입력받아 각 자리별로 한 줄에 하나씩 []속에 넣어 출력한다.

	예)
	75254가 입력되면
	[70000]
	[5000]
	[200]
	[50]
	[4]가 출력된다.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int len = input.length();

		for (int i = 0; i < len; i++) {
			String temp = "[" + input.charAt(i);
			for (int j = len-i; j > 1; j--) {
				temp += '0';
			}
			temp += "]";
			System.out.println(temp);
		}
	}
}