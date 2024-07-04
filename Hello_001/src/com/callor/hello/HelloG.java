package com.callor.hello;

/*
 * main method 를 만들고
 * 정수 1~10까지 숫자를 Console 에 출력하기
 */

public class HelloG {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// for 문 사용시 시작값은 0, 조건식은 = 을 사용하지 않는 것이 좋다.

		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
		System.out.println("=".repeat(30));

		// 위에서 사용한 for 문 둘 다 값은 똑같지만 아래에 사용한 for 문이 더 깔끔하기 때문에
		// 조금 더 수식을 치더라도(i + 1) 아래처럼 작성하는 것이 좋다.

		/*
		 * 1~10까지 정수를 1,2,3,...10 가로방향으로 출력하기
		 */

		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1);
			if (i + 1 < 10) {
				System.out.print(", ");
			}
		}
		/*
		 * 위에 for 문에서 결과값을 i+1으로 사용하였기 때문에 if 문에서도 i < 9보다 i+1 < 10 으로 작성하는 것이 헷갈리지 않고
		 * 좋다
		 */

		// = 표시 30개까지 줄을 출력(repeat(30))하기 전에 Enter 를 출력(\n)하여 줄바꿈 효과를 내라
		System.out.println("\n" + "=".repeat(30));

		/*
		 * 1~100까지 숫자를 1 2 3 처럼 빈칸으로 구분하여 출력 단, 5개의 숫자를 출력한 후 줄바꿈하기 1 2 3 4 5 6 7 8 9 10
		 * 형식으로 출력
		 */

		for (int i = 0; i < 100; i++) {
			System.out.print(i + 1 + " ");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		

		for (int i = 0; i < 100; i++) {
			
//			System.out.print(i+1);
//			System.out.print(" ");
			
			System.out.printf("%d", i+1);
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("\n" + "=".repeat(30));

		for (int i = 0; i < 100; i++) {
			System.out.print(i + 1);

			if (i + 1 < 100) {
				System.out.print(" ");
				if ((i + 1) % 5 == 0) {
					System.out.print("\n");
				}
			}
		}
		/*
		 * if문은 최소한으로 쓰는게 좋아서 첫번째 혹은 두번째 방법이 더 좋다.
		 */
	}
}
