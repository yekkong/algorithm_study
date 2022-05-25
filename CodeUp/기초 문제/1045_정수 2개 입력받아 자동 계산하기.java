/*
	1045 - 정수 2개 입력받아 자동 계산하기

	정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값(소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력)을 자동으로 계산해보자.
	단 0 <= a, b <= 2147483647, b는 0이 아니다.

	예) 
	10 3 ->
	13
	7
	30
	3
	1
	3.33

*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();

		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.printf("%.2f", (double)(a)/b); // if you don't cast a or b as a double, you'll end up doing integer division

	}
}