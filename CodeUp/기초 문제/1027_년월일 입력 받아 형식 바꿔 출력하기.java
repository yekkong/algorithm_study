/*
	1027 - 년월일 입력 받아 형식 바꿔 출력하기

	년월일을 출력하는 방법은 나라마다, 형식마다 조금씩 다르다.
	년월일(yyyy.mm.dd)를 입력받아 일월년(dd-mm-yyyy)로 출력해보자.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] date = input.split("[.]");
		System.out.println(date[2] + "-" + date[1] + "-" + date[0]);
	}
}