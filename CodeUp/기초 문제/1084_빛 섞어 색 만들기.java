/*
	1084 - 빛 섞어 색 만들기

	빨강(red), 초록(green), 파랑(blue) 빛을 섞어 여러 가지 빛의 색을 만들어 내려고 한다.
	빨강(r), 초록(g), 파랑(b) 각각의 빛의 개수가 주어질 때, 
	주어진 rgb 빛들을 다르게 섞어 만들 수 있는 모든 경우의 조합(r g b)과 총 가짓 수를 계산해보자.

	예) 2 2 2 ->
	0 0 0
	0 0 1
	0 1 0
	0 1 1
	1 0 0
	1 0 1
	1 1 0
	1 1 1 
	8
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int red = sc.nextInt();
		int green = sc.nextInt();
		int blue = sc.nextInt();
		int cnt = 0;

		for (int r = 0; r < red; r++) {
			for (int g = 0; g < green; g++) {
				for (int b = 0; b < blue; b++) {
					System.out.println(r + " " + g + " " + b);
					cnt++;
				}
			}
		}

		System.out.println(cnt);
	}
}