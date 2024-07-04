package com.callor.hello;

/*
 * 10 ~ 50 범위의 Random 정수 1개를 생성하고
 * 생성한 Random 수 만큼의 정수형 배열을 선언하고
 * 배열의 각 요소에 1~100까지 범위의 Random 수를 저장
 * 배열에 저장된 값을 출력
 */
public class HelloJ {
	public static void main(String[] args) {
		/*
		 * Math.random() : 0 ~ 1 미만의 실수(0.99999999....., 0.9)
		 * 10 ~ 50 까지의 정수를 만들려면
		 * 먼저 0.99 * x = 50 - 10
		 */
		int num = (int) (Math.random() * 41 + 10);

		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}
		for(int number : arr) {
			System.out.print(number);
			System.out.print(" ");
		}
		System.out.println("\n"+"=".repeat(30));
		
		// 생성된 arr 의 요소들의 전체를 합산하고, 평균을 계산하여 출력
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double average = (double)sum / arr.length ;
		System.out.printf("배열 각 요소의 합 : %d\n ",sum);
		System.out.printf("배열 각 요소의 평균 : %.2f",average);
	}
}
