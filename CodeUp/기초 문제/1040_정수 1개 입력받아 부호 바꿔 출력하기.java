/*
	1040 - 정수 1개 입력받아 부호 바꿔 출력하기

	입력된 정수의 부호를 바꿔 출력해보자.
	단, -2147483647 ~ +2147483647 범위의 정수가 입력된다.

	힌트: 단형 연산자인 -(negative)를 변수 앞에 붙이면 부호가 반대로 바뀌어 계산된다.

	예) -1 -> 1
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(-n); // because you're printing the negative of the number and not simply adding a - sign in front of the number, you don't have to worry about 0 being printed out as -0.
	}
}