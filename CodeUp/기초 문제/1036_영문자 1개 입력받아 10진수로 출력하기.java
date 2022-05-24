/*
	1036 - 영문자 1개 입력받아 10진수로 출력하기

	영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력해보자.

	참고로 컴퓨터로 저장되는 모든 데이터는 2진 정수화되어 저장되는데,
	영문자와 특수기호 등을 저장하는 방법으로 아스키코드가 기본적으로 사용된다.
	예를 들어 영문 대문자 "A"는 10진수 65를 의미하는 2진수 값으로 저장된다.

	예) A -> 65
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.nextLine().charAt(0); // Java doesn't have a nextChar() function. Therefore, you have to get the line then get the first character of that line.
		System.out.println((int)c); // you can cast a char into an int but you can't cast a String into an int
	}
}