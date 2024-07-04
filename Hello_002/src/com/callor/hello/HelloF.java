package com.callor.hello;

public class HelloF {

	/*
	 * 아래코드에 별도의 변수를 선언하지 않고 prime 수 인지를 검사하는 코드를 완성
	 */

	public static void main(String[] args) {

		int num = 7;
		for (int i = 2; i < (num / 2); i++) {
			if (num % i == 0) {
				System.err.println(num + "는 소수 아님");
			}else {
				System.err.println(num + "는 소수");
			}
		}

		System.out.println("=".repeat(30));
		// for 문 안에 설정하는 건 의미가 없음...
		
		int index;
		for (index = 2; index < num; index++) {
			if(num % index == 0) {
				break;
			}
		}
		if(index < num) {
			System.err.println(num + "는 소수 아님");
		}else {
			System.err.println(num + "는 소수");
		}
		
	}
}
