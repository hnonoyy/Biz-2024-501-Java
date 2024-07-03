package com.callor.hello;

public class HelloB {

	/* 
	 * A와 결과값은 같지만 A와 다르게 변수를 이용함
	 * 
	 * num1, num2 변수에 각각 정수값을 입력하고
	 * sum 변수에 num1, num2 덧셈값을 입력하여 
	 * sum 값을 출력하는 형태로 사용
	 * 
	 * 이렇게 사용했을 경우 HelloA보다 더 효율적으로 기억장소를 사용할 수 있다.
	 */
	
	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 40;
		int sum = num1 + num2;

		System.out.println(sum);
		System.out.println(sum);
		System.out.println(sum);
		System.out.println(sum);
		System.out.println(sum);
	}
}
