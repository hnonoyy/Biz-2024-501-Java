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

public class ScannerC {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = null;
		// 헝가리언 표기법
		// 변수명 시작을 변수의 type 명칭으로 시작하는 표기법
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		int intSum = 0;
		float floatAvg = 0;

		System.out.println("학생의 이름을 입력하세요");
		System.out.print(">>");
		name = scan.nextLine();

		System.out.println("과목 점수를 입력하세요");
		while (true) {
			System.out.print("국어 >> ");
			String strKor = scan.nextLine();
			try {
				intKor = Integer.parseInt(strKor);
				if (intKor < 0 || intKor > 100) {
					System.out.println("점수는 0부터 100점까지만 입력하세요");
					continue;
				}
			} catch (Exception e) {
				System.out.println("국어 점수는 숫자로만 입력하세요");
				continue;
			}
			break;
		}
	}
}
