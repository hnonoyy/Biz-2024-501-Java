package com.callor.hello;

/*
 * 정수형 배열 100개를 선언하고
 * 0번 배열부터 순서대로 1 ~ 100까지 저장하기 
 */

public class HelloH {
	public static void main(String[] args) {
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
	}
}
