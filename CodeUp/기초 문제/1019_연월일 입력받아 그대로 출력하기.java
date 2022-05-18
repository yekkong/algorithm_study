/*
	1019 - 연월일 입력받아 그대로 출력하기

	년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.
	연, 월, 일이 "."으로 구분되어 입력될 때 yyyy.mm.dd 형식으로 출력하면 된다.

	예) 2013.8.5가 입력되면 2013.08.05로 출력한다.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String output = "";

		// split input by .
		// this is necessary because if the month or date is < 10, we need to add a 0 in front of it
		String[] date = input.split("[.]"); // . is a special character; hence, we need to escape the special character

		if (date[0].length() < 4) {
			// year is less than 4 characters long 
			// add 0's
			int len = date[0].length();
			while (len < 4) {
				output += "0";
				len++;
			}
		}

		output = output + date[0] + "."; // add year

		if (date[1].length() == 1) {
			// month is less than 10
			// add 0 in front
			output += "0";
		}

		output = output + date[1] + "."; // add month

		if (date[2].length() == 1) {
			// date is less than 10
			// add 0 in front 
			output += "0";
		}

		output += date[2]; // add date

		System.out.println(output);
	}
}