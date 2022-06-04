/*
	1069 - 평가 입력받아 다르게 출력하기

	평가를 문자(A, B, C, D,...)로 입력받아 내용을 다르게 출력해보자.
	A는 best!!!
	B는 good!!
	C는 run!
	D는 slowly~
	나머지 문자들은 what?으로 평가되어야 한다.

	예) A -> best!!!
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		// Let's try solving this using a switch statement
		// Remember to put a break at the end of each case!
		switch(s) {
		case "A":
			System.out.println("best!!!");
			break;
		case "B":
			System.out.println("good!!");
			break;
		case "C":
			System.out.println("run!");
			break;
		case "D":
			System.out.println("slowly~");
			break;
		default:
			System.out.println("what?");
			break;
		}
	}
}

/*
	Notes regarding this problem:

	If you don't put break statements, an input of 'A' would result in...
	best!!!
	good!!
	run!
	slowly~
	what?
*/