/*
	1064 - 정수 3개 입력받아 가장 작은 수 출력하기

	입력된 세 정수 a,b,c 중 가장 작은 값을 출력하는 프로그램을 작성해보자.
	단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.

	예) 3 -1 5 -> -1
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int comp1 = (a < b) ? a : b;
		int comp2 = (a < c) ? a : c;
		int comp3 = (comp1 < comp2) ? comp1 : comp2;

		System.out.println(comp3);
	}
}