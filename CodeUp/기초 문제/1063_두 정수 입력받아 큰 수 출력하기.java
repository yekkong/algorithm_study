/*
	1063 - 두 정수 입력받아 큰 수 출력하기

	입력된 두 정수 a,b 중 큰 값을 출력하는 프로그램을 작성해보자.
	단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.

	힌트: 3항 연산자는 "조건식 ? (참일 때의 값) : (거짓일 때의 값)"의 형태로 사용하는 연산자이다.

	예) 123 456 -> 456
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = (a > b) ? a : b;
		System.out.println(result);
	}
}