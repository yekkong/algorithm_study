/*
	1066 - 정수 3개 입력받아 짝/홀 출력하기

	세 정수 a,b,c가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자.

	예) 1 2 8 ->
	odd
	even
	even
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			int num = sc.nextInt();

			if (num % 2 == 0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		}
	}
}