package com.callor.hello;

/*
 * main() method 를 선언하고
 * 정수형 숫자 30과 40을 변수에 저장한 후 
 * 사칙연산 결과를 출력하시오
 */
public class HelloE {

	public static void main(String[] args) {
		/*
		 * 숫자를 각각 변수에 저장한 후 사칙연산 결과를 출력
		 * 마지막 나눗셈 값은 실수형 데이터기 때문에 그냥 출력했을 경우 
		 * int값인 0으로 출력되어 실수형 데이터인 double 혹은 float 값으로 바꿔서 출력해야한다.
		 */
		int num1 = 30;
		int num2 = 40;

		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println((double) num1 / num2);
		
	}

}
