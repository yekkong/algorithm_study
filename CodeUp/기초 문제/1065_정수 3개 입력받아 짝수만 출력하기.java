/*
	1065 - 정수 3개 입력받아 짝수만 출력하기

	세 정수 a,b,c가 입력되었을 때, 짝수만 출력해보자.

	예) 1 2 4 ->
	2
	4
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			int a = sc.nextInt();

			if (a % 2 == 0) {
				System.out.println(a);
			}
		}
	}
}