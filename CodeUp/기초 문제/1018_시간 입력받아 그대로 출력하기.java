/*
	1018 - 시간 입력받아 그대로 출력하기

	어떤 형식에 맞추어 시간이 입력될 때, 그대로 출력하는 연습을 해보자.

	시(hour)와 분(minute)이 ":"으로 구분되어 입력된다. 입력받은 시간을 "시:분" 형식으로 출력해보자.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		System.out.println(time);
	}
}