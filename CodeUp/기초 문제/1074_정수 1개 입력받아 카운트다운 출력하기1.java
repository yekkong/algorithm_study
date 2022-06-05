/*
	1074 - 정수 1개 입력받아 카운트다운 출력하기1

	정수(1~100) 1개가 입력되었을 때 카운트다운을 출력해보자.
	1씩 줄이면서 한 줄에 하나씩 1이 될 때까지 출력하면 된다.

	예) 5 ->
	5
	4
	3
	2
	1
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while (n > 0) {
			System.out.println(n);
			n--;
		}
	}
}