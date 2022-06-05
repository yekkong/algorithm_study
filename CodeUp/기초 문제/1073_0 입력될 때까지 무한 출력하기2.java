/*
	1073 - 0 입력될 때까지 무한 출력하기2

	정수가 순서대로 입력된다.
	0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.
	입력되는 정수는 -2147483648 ~ +2147483647이다. 그러나 개수는 알 수 없다.

	예) 7 4 2 3 0 1 5 6 9 10 8 ->
	7
	4
	2
	3
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		/*
			This is the same problem as problem #1071.
			1071 was intended to be solved using a goto statement while this was intended to be solved using a while loop.
			Since Java doesn't support goto statements, I used a while loop for both.
			Hence, the solution to both problems is the same, in my case.
		*/

		while (n != 0) {
			System.out.println(n);
			n = sc.nextInt();
		}
	}
}

/*
	Question about this problem:
	What happens if none of the numbers added are 0's..? 
	Is it guaranteed that a 0 will be one of the inputs?
	Or is there some way to break out of the loop if we have reached the end of the line?
*/