/*
	1034 - 8진 정수 1개 입력받아 10진수로 출력하기

	8진수로 입력된 정수 1개를 10진수로 바꾸어 출력해보자.

	힌트: Scanner class의 .nextInt(int radix) 함수를 이용해보자!

	예) 13 -> 11
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(8);
		System.out.printf("%d", n); // use %d to convert n into decimal format
	}
}