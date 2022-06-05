/*
	1075 - 정수 1개 입력받아 카운트다운 출력하기2

	정수(1~100) 1개가 입력되었을 때 카운트다운을 출력해보자.
	1씩 줄이면서 한 줄에 하나씩 0이 될 때까지 출력하면 된다.

	예) 5 ->
	4
	3
	2
	1
	0
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		/*
			This problem differs from problem #1074. 
			Instead of starting at n and counting down till 1, we start at n-1 and count down till 0.
		*/

		while (n > 0) {
			System.out.println(n-1);
			n--;
		}
	}
}