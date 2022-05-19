/*
	1021 - 단어 1개 입력받아 그대로 출력하기

	1개의 단어를 입력받아 그대로 출력해보자.
	단어의 길이는 50자 이하이다.

	에) Informatics -> Informatics
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(input);
	}
}