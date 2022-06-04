/*
	1068 - 정수 1개 입력받아 평가 출력하기

	점수(정수, 0 ~ 100)를 입력받아 평가를 출력해보자.
	90 ~ 100는 A
	70 ~ 89는 B
	40 ~ 69는 C
	0 ~ 39는 D로 평가되어야 한다.

	예) 73 -> B
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();

		if (score >= 90 && score <= 100) {
			System.out.println("A");
		}
		else if (score >= 70 && score <= 89) {
			System.out.println("B");
		}
		else if (score >= 40 && score <= 69) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
	}
}