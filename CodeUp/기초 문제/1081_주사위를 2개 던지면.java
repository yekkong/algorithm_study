/*
	1081 - 주사위를 2개 던지면

	1부터 n까지, 1부터 m까지 숫자가 적힌
	서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.

	예) 2 3 ->
	1 1
	1 2
	1 3
	2 1
	2 2
	2 3
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.println(i + " " + j);
			}
		}
	}
}