package com.callor.hello;

/*
 * 정수형 배열 50개를 선언하고
 * 정수 2 ~ 100 범위의 Random 수를 각각 생성하여
 * 배열 요소에 저장
 * 
 * 배열에 저장된 정수들 중에 prime 수만 합산하여 출력
 * 배열에 저장된 정수들 중에 prime 수가 몇개인가 출력
 */
public class HelloL {

	public static void main(String[] args) {
		
		int[] arr = new int[50];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 99 + 2);
		}
		int count = 0;
		int sum = 0;
		for (int num : arr) {
			int index;
			for (index = 2; index < num; index++) {
				if (num % index == 0) {
					break;
				}
			}
			if (index == num) {
				count++;
				sum += num;
			}
		}
		System.out.printf("배열에서 소수인 정수들의 합은 %d 이고, 소수의 개수는 %d 입니다.",sum ,count);
	}
}
