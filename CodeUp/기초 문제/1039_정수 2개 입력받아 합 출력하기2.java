/*
	1039 - 정수 2개 입력받아 합 출력하기2

	정수 2개를 입력받아 합을 출력해보자.
	단, 입력되는 정수는 -2147483648 ~ +2147483648 이다.
	계산된 결과가 int 형으로 저장할 수 있는 범위를 넘어갈 수 있다는 걸 주의하자!

	예) 2147483648 2147483648 -> 4294967296 
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong(); // use long datatype to ensure input & sum are calculated and stored properly
		long b = sc.nextLong();
		System.out.println(a+b);
	}
}