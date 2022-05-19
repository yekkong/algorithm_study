/*
	1020 - 주민번호 입력받아 형태 바꿔 출력하기

	주민번호는 다음과 같이 구성된다: XXXXXX-XXXXXXX
	앞의 6자리는 생년월일(yymmdd)이고 뒤 7자리는 성별, 지역, 오류검출코드이다.
	'-'로 구분되어 입력된 주민번호를 '-'를 제외하고 출력해보자.

	예) 000907-1121112 -> 0009071121112
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] split = input.split("-");
		System.out.println(split[0] + split[1]);
	}
}