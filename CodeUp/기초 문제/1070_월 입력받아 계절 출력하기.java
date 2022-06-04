/*
	1070 - 월 입력받아 계절 출력하기

	월이 입력될 때 계절 이름이 출력되도록 해보자.
	12, 1, 2월은 winter
	3, 4, 5월은 spring
	6, 7, 8월은 summer
	9, 10, 11울은 fall으로 평가되어야 한다.

	예) 12 -> winter
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();

		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("fall");
			break;
		}
	}
}