/*
	1017 - 정수 1개 입력받아 3번 출력하기

	int형 정수 1개를 입려갇아 공백을 사이에 두고 3번 출력해보자.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a + " " + a + " " + a);
	}
}