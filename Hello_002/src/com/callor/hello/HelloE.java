package com.callor.hello;

/*
 * prime(int num) method 를 생성하고
 * 매개변수로 전달받은 num 의 값이 소수인지 판별하여
 * 결과를 return 하기
 * 
 * 소수는 약수가 1과 자신만을 가진 자연수
 */
public class HelloE {

	public static boolean prime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}return true;
	}

	public static void main(String[] args) {
		
		int num = 14;
		if (prime(num) == true) {
			System.out.printf("%d 은 소수입니다.", num);
		} else {
			System.out.printf("%d 은 소수가 아닙니다.", num);
		}

	}
}
