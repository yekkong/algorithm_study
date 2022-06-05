/*
	1072 - 정수 입력받아 계속 출력하기

	n개의 정수를 입력받아 한 개씩 줄을 바꿔 출력해보자.
	입력되는 정수는 -2147483648 ~ +2147483647이다. 단, n의 최대 개수는 알 수 없다.

	예)
	5
	1 2 3 4 5 ->
	1
	2
	3
	4
	5
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(); // number of inputs; it's probably sufficient to use int, but I used long just in case
		long cnt = 0;

		while (cnt < n) {
			int temp = sc.nextInt();
			System.out.println(temp);
			cnt++;
		}
	}
}