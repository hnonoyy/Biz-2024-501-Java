package com.callor.hello;

/*
 *  2~100까지 범위의 임의 Random 수 1개를 만들고
 *  그 수가 prime 인지 아닌지 판단 
 */
public class HelloK {

	public static void main(String[] args) {
		int primeNum = (int) (Math.random() * 99 + 2);
		int index;
		for (index = 2; index < primeNum; index++) {
			if(primeNum % index == 0) {
				break;
			}
		}
		if(index > primeNum) {
			System.out.printf("%d는 소수입니다",primeNum);
		}else {
			System.out.printf("%d는 소수가 아닙니다",primeNum);
		}
	}
}
