/*
	1030 - 정수 1개 입력받아 그대로 출력하기3

	정수 1개를 입력받아 그대로 출력해보자.
	단, 입력되는 정수의 범위는 -9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807 이다.

	참고로 -2147483648 ~ +2147483647 범위의 정수를 저장하고 처리하기 위해서는 int 데이터형을 
	사용해 변수를 선언하면 된다. long 데이터형을 사용하면
	-9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807 범위의 정수값을
	저장시킬 수 있다.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(n);
	}
}