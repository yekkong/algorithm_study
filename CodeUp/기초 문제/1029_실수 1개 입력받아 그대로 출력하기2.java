/*
	1029 - 실수 1개 입력받아 그대로 출력하기2

	소수점 아래 숫자가 11개 이하인 실수 1개를 입력받아 소수점 이하 11자리까지 반올림하여 출력해보자.
	(단, 입력되는 실수의 범위는 +- 1.7*10^-308 ~ +- 1.7*10^308 이다.)

	참고로 float 데이터형을 사용하면 +- 3.4*10^-38 ~ +- 3.4*10^38 범위의 실수를 저장할 수 있다.
	이 범위를 넘어가는 (더 작거나 더 큰) 실수를 저장하기 위해서는 보다 큰 범위를 저장할 수 있는
	다른 데이터형을 사용해야 정상적으로 저장시킬 수 있다.
	double은 더 정확하게 저장할 수 있지만, float보다 2배의 저장 공간이 필요하다.

	힌트: %.11f를 사용하면 소수점 이하 11자리까지 출력된다.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		System.out.printf("%.11f", d);
	}
}