/*
	1008 - 출력하기08

	이번에는 특수문자를 출력하는 연습을 해보자.
	키보드로 입력할 수 없는 다음 모양을 출력해보자.
	(참고: 운영체제의 문자 시스템에 따라 아래와 같은 모양이 출력되지 않을 수 있다.)
	┌┬┐
	├┼┤
	└┴┘
	(참고: 다음과 같은 유지코드로 특수문자를 표현한다고 하자. 윈도우에서는 "ㅂ+한자 키를 누르면 선문자를 입력할 수 있다.)
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("\u250C\u252C\u2510");
        System.out.println("\u251C\u253C\u2524");
        System.out.println("\u2514\u2534\u2518");
    }
}