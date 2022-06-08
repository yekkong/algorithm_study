/*
	1082 - 16진수 구구단

	16진수를 배운 영일이는 16진수끼리 곱하는 16진수 구구단에 대해서 궁금해졌다.
	A,B,C,D,E,F 중 하나가 입력될 때, 1부터 F까지 곱한 16진수 구구단의 내용을 출력해보자.

	예) B ->
	B*1=B
	B*2=16
	B*3=21
	B*4=2C
	B*5=37
	B*6=42
	B*7=4D
	B*8=58
	B*9=63
	B*A=6E
	B*B=79
	B*C=84
	B*D=8F
	B*E=9A
	B*F=A5
*/

import java.util.Scanner;
import java.lang.Integer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(16); // convert hex input to decimal and store in input
		String n = Integer.toHexString(input).toUpperCase(); // convert input to hex string (uppercase)

		for (int i = 1; i <= 15; i++) {
			int temp = input * i;
			String mult = Integer.toHexString(i).toUpperCase(); // convert i to hex (uppercase)
			String result = Integer.toHexString(temp).toUpperCase(); // convert input * i to hex (uppercase)

			System.out.println(n + "*" + mult + "=" + result);
		}
	}
}