/*
	1022 - 문장 1개 입력받아 그대로 출력하기

	공백 문자가 포함되어 있는 문장을 입력받고 그대로 출력하는 연습을 해보자.
	입력되는 문장은 여러 개의 단어로 구성되고, 엔터로 끝나며, 최대 길이는 2000 문자를 넘지 않는다.

	예) Programming is very fun!! -> Programming is very fun!!
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(input);
	}
}