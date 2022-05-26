/*
	1048 - 한 번에 2의 거듭제곱 배로 출력하기

	정수 2개(a, b)를 입력받아 a를 2^b배 곱한 값으로 출력해보자.
	0 <= a <= 10, 0 <= b <= 10이다.

	예) 1 3 -> 8
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a << b);
	}
}