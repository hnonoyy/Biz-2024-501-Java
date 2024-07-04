package com.callor.hello;

public class HelloG {

	/*
	 * for 문 ( 반복문의 시작 ; 언제까지 반복할 것인가 ; 한 회 반복 후 어떻게 증가할 것인가)
	 */
	public static void main(String[] args) {
		int index = 0;
		//while 문과 같음 무한 반복
		for (;;) {
			// 1씩 증가하고 99가 넘으면 멈춤
			if (index++ > 99) {
				break;
			}
			System.out.println("Hello Korea");
		}
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello Korea ");
		}
		// 위 아래 결과값 같음
	}
}
