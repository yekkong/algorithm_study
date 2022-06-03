/*
	1067 - 정수 1개 입력받아 분석하기

	정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
	-2147483648 ~ +2147483647 사이의 정수 1개가 입력된다. 
	단, 0은 입력되지 않는다.

	예) -2147483648 ->
	minus
	even
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n < 0) {
			System.out.println("minus");
		}
		else {
			// no need to check for n == 0 because the input condition is that n != 0
			System.out.println("plus");
		}

		if (n % 2 == 0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}
}