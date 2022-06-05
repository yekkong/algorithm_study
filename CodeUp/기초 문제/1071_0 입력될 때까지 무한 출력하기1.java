/*
	1071 - 0 입력될 때까지 무한 출력하기1

	정수가 순서대로 입력된다.
	입력되는 정수는 -2147483648 ~ +2147483647지만 몇개의 숫자가 입력되는지는 알 수 없다.
	입력된 정수가 0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.

	예) 7 4 2 3 0 1 5 6 9 10 8 ->
	7
	4
	2
	3
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while (n != 0) {
			System.out.println(n);
			n = sc.nextInt();
		}
	}
}