package com.callor.hello;

/*
 * main() method 생성하고
 * 1~100까지 숫자중 짝수만 출력하기
 * 
 * 짝수는 2로 나눴을 때 나머지가 0이면 짝수
 */
public class HelloA {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if ((i + 1) % 2 == 0) {
				System.out.print(i + 1 + " ");
			}
		}
	}
}
