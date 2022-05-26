/*
	1047 - 정수 1개 입력받아 2배 곱해 출력하기

	정수 1개를 입력받아 2배 곱해 출력해보자.
	입력되는 정수는 -1073741824 ~ +1073741823 이다.

	*2의 값을 출력해도 되지만, 정수를 2배로 곱하거나 나누어 계산해주는 비트단위시프트연산자 <<,>>를 이용해보자.
	2진수 형태로 저장되어 있는 값들을 왼쪽(<<)이나 오른쪽(>>)으로
	지정한 비트 수만큼 밀어주면 2배씩 늘어나거나 반으로 줄어들고 범위(32비트)를 넘어서 이동되는 비트는 삭제된다.

	예) 1024 -> 2048
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a << 1);
	}
}