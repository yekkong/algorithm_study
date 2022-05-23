/*
	1031 - 10진 정수 1개 입력받아 8진수로 출력하기

	10진수를 입력받아 8진수(octal)로 출력해보자.
	입력되는 정수는 int 범위이다.

	힌트: int(10진수 형태)로 입력받고 %o를 사용해 출력하면 8진수(octal)로 출력된다.

	예) 10 -> 12
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.printf("%o", n);
	}
}