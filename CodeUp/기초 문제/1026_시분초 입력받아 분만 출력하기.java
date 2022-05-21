/*
	1026 - 시분초 입력받아 분만 출력하기

	입력되는 시:분:초 에서 분만 출력해보자.

	예) 17:23:57 -> 23
	17:03:38 -> 3 (NOT 03)
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] time = input.split(":");
		String minute = time[1];

		// if minute is less than 10, we have to exclude the first char (we have to exclude the 0)
		if (minute.charAt(0) == '0') {
			minute = minute.substring(1);
		}

		System.out.println(minute);

	}
}