/*
	1037 - 정수 입력받아 아스키 문자로 출력하기

	10진 정수 1개를 입력받아 아스키 문자로 출력해보자.
	단, 0~255 범위의 정수만 입력된다.

	예) 65 -> A
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char c = (char) n;
		System.out.println(c);
	}
}