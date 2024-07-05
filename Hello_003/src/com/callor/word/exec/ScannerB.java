package com.callor.word.exec;

import java.util.Scanner;

/*
 * 키보드를 통하여 학생이름, 국어, 영어, 수학 성적을 차례로 입력받고
 * 
 * ===================================================
 * 학생이름 : 000
 * 국어 : 000
 * 영어 :000
 * 수학 :000
 * ---------------------------------------------------
 * 총점: 000
 * 평균 :000
 * ====================================================
 */

public class ScannerB {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("이름을 입력해주세요 : ");
		String name = scan.nextLine();
		System.out.print("국어 성적을 입력해주세요 : ");
		String korean = scan.nextLine();
		System.out.print("영어 성적을 입력해주세요 : ");
		String english = scan.nextLine();
		System.out.print("수학 성적을 입력해주세요 : ");
		String math = scan.nextLine();

		int KoreanRecode = Integer.parseInt(korean);
		int EnglishRecode = Integer.parseInt(english);
		int MathRecode = Integer.parseInt(math);

		int sum = KoreanRecode + EnglishRecode + MathRecode;
		float avg = (float) sum / 3;

		System.out.println("=".repeat(30));
		System.out.printf("학생이름 : %s\n", name);
		System.out.printf("국어 : %s\n", korean);
		System.out.printf("영어 : %s\n", english);
		System.out.printf("수학 : %s\n", math);
		System.out.println("-".repeat(30));
		System.out.printf("총점 : %d\n", sum);
		System.out.printf("평균 : %.2f\n", avg);
		System.out.println("=".repeat(30));
	}
}
