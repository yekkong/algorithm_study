/*
	1023 - 실수 1개 입력받아 부분별로 출력하기

	실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.

	예) 1.414213 -> 1 \n 414213
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] split = input.split("[.]"); // remember: . is a special character
		System.out.println(split[0]);
		System.out.println(split[1]);
	}
}