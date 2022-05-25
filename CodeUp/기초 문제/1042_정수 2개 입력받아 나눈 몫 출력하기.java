/*
	1042 - 정수 2개 입력받아 나눈 몫 출력하기

	정수 2개(a,b)를 입력받아 a를 b로 나눈 몫을 출력해보자.
	단, -2147483648 <= a <= b <= +2147483647, b는 0이 아니다.

	예) 1 3 -> 0
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt(); // the instructions say that b isn't 0, so we don't need to check for division by zero
		System.out.println(a/b);
	}
}