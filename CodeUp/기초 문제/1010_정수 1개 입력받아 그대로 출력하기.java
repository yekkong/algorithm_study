/*
	1010 - 정수 1개 입력받아 그대로 출력하기

	정수형(int)으로 변수를 선언하고, 변수에 정수값을 저장한 후
	변수에 저장되어 있는 값을 그대로 출력해보자.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n);
	}
}