/*
	1011 - 문자 1개 입력받아 그대로 출력하기

	문자형(char)으로 변수를 하나 선언하고, 변수에 문자를 저장한 후
	변수에 저장되어 있는 문자를 그대로 출력해보자.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char x = sc.nextLine.charAt(0); // get first letter of input
		System.out.println(x);
	}
}