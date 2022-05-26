/*
	1046 - 정수 3개 입력받아 합과 평균 출력하기

	정수 3개를 입력받아 합과 평균을 출력해보자.
	평균은 소수점 이하 둘째 자리에서 반올림해서 소수점 이하 첫째 자리까지 출력하면 된다.
	입력되는 정수의 값은 단, -2147483648 ~ +2147483647 이다.

	예) 1 2 3 ->
	6
	2.0
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long sum = a + b + c;
		double average = sum / 3.0;

		System.out.println(sum);
		System.out.printf("%.1f", average);
	}
}