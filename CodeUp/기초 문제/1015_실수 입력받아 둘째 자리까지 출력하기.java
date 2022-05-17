/*
	1015 - 실수 입력받아 둘째 자리까지 출력하기

	실수(float) 1개를 입력받아 저장한 후, 저장되어 있는 값을 소수점 셋 째 자리에서
	반올림하여 소수점 이하 둘 째 자리까지 출력하시오.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float f = sc.nextFloat();
		System.out.printf("%.2f", f); // notation used to print out a certin number of decimal places
		
		// printf() is used to print out formatted Strings in Java
		// in this example, we want to format f such that it contains only two decimal places. Hence, we use printf() instead of println().
	}
}