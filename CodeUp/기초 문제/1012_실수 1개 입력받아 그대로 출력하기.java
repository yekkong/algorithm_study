/*
	1012 - 실수 1개 입력받아 그대로 출력하기

	실수형(float)로 변수를 선언하고 그 변수에 실수값을 저장한 후
	저장되어 있는 실수값을 출력해보자.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x = sc.nextFloat();
		/*
			If we use System.out.println, then the input 1.540000 would print 1.54.
			In this problem we want to print the input exactly the way it was given to us.
			Hence, we must use printf instead.
		*/
		System.out.printf("%f", x);
	}
}