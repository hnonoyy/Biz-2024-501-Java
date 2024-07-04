package com.callor.hello;

public class HelloA {

	/*
	 * 변수를 저장하지 않고 실행시 30, 40, +값이 각자 저장된다.
	 * 같은 결과값이 나오더라도 그 값이 재활용 되어 사용되는것이 아닌
	 * 각각의 결과값이 각자 저장되어 저장소를 많이 사용한다.
	 */

	public static void main(String[] args) {
		System.out.println("Hello Korea");
		System.out.println(30 + 40);
		System.out.println(30 + 40);
		System.out.println(30 + 40);
		System.out.println(30 + 40);
		System.out.println(30 + 40);

	}

}
