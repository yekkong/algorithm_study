/*
	1038 - 정수 2개 입력받아 합 출력하기1

	정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자.
	단, 입력되는 정수는 -1073741824 ~ 1073741824 이다.

	주의: 계산의 결과가 int 범위를 넘어가는지를 잘 생각해 보아야 한다.

	예) 123 -123 -> 0
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong(); // use nextLong() to store input as a long
		long b = sc.nextLong();
		long sum = a + b; // use long to make sure our sum can be stored properly (int might be too small)
		System.out.println(sum);
	}
}