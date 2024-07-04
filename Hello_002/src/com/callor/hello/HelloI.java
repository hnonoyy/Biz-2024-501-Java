package com.callor.hello;

/*
 * 정수형 배열 100개를 선언하고, 
 * 1~100 범위의 Random 수를 생성하여 배열 100개에 할당하기
 */
public class HelloI {
	public static void main(String[] args) {
		int[] arr = new int[100];
		// 배열에 임의 정수를 할당하는 block
		for (int i = 0; i < arr.length; i++) {
			arr[i] =(int) (Math.random() * 100) + 1;
		}
		// 배열에 저장된 값을 출력하는 block
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
			if((i+1) % 5 == 0) System.out.println() ;
		}
		// 단일 책임의 원칙
		// 위에 for 문 처럼 각각 설정하는 것이 좋다.
		// 할당하는 for 문 출력하는 for 문
	}
}
