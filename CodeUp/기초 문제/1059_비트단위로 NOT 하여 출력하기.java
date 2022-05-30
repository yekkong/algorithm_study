/*
	1059 - 비트단위로 NOT 하여 출력하기

	입력 된 정수를 비트단위로 참/거짓을 바꾼 후 정수로 출력해보자.

	힌트: 비트단위(bitwise)연산자 ~를 붙이면 된다.

	예) 2 -> -3
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(~a);
	}
}