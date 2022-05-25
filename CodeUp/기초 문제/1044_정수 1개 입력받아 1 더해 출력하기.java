/*
	1044 - 정수 1개 입력받아 1 더해 출력하기

	정수를 1개 입력받아 1만큼 더해 출력해보자.
	단, -2147483648 ~ +2147483647 의 범위로 입력된다

	계산되고 난 후의 값의 범위(데이터형)에 주의하자!

	예) 2147483647 -> 2147483648
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(); // we have to use the long data type, because int covers only until 2147483647; if 2147483647 is given as the input, adding 1 would result in an overflow
		System.out.println(n+1);
	}
}