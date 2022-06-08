/*
	1083 - 3 6 9 게임의 왕이 되자!

	3 6 9 게임을 하던 영일이는 3 6 9 게임에서 잦은 실수로 계속해서 벌칙을 받게 되었다.
	3 6 9 게임의 왕이 되기 위한 마스터 프로그램을 작성해 보자.
	10보다 작은 정수가 1개 입력될 것이다.
	1부터 그 수까지 순서대로 공백을 두고 수를 출력하는데, 3 또는 6 또는 9인 경우 그 수 대신 영문 대문자 X를 출력하면 된다. 

	예) 9 -> 1 2 X 4 5 X 7 8 X
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				// this condition only works because instructions say that n < 10
				// if can also be >= 10, we would need to add a && i < 10 to the condition
				System.out.print("X ");
			}
			else {
				System.out.print(i + " ");
			}
		}
	}
}