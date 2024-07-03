package com.callor.hello;

/*
 * 변수 : 데이터를 보관하는 기억장소
 * 변수명 :	보관된 데이터를 재활용하기 위해 임의로 이름을 부여한다. 
 * 첫글자는 영문소문자, 특별히 underBar(_)로 시작할 수 있다.
 * 이후 글자는 영문대소문자, 숫자, _ 가 올 수 있다.
 * 2개 이상의 단어를 조합할 때는 Camel Case 로 한다.
 */

public class HelloC {
	public static void main(String[] args) {
		/*
		 * 이미 위에서 연산된 변수는 
		 * 다시 변수값을 재지정하더라도 적용되지않는다.
		 * 
		 * 다만, 변수값을 재설정 후 아래에 다시 sum(연산값 입력한 변수)을 입력했을 경우 재설정된 값으로 출력된다.
		 *  
		 */
		int num1 = 30;
		int num2 = 40;
		int sum = num1 + num2;
		
		num1 = 100;
		num2 = 0;

		//sum = num1 + num2; > 값은 100으로 나온다.
		System.out.println(sum);
	}
}
