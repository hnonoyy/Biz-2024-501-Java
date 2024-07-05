package com.callor.word.exec;

import java.io.FileNotFoundException;
import java.util.Scanner;

import com.callor.word.models.WordVO;
import com.callor.word.service.WordService;
import com.callor.word.service.impl.WordServiceImplV2;
import com.callor.word.utils.Line;

/*
 * main() method 를 생성하고
 * wordService, WordServiceImplV2 를 사용하여
 * 임의의 단어를 한개 추출하고
 * 한글번역을 보여준 후 영어 단어를 입력받아
 * 단어가 맞았는지 틀렸는지 판별하는 코드를 작성
 */
public class WordExecC {

	public static void main(String[] args) {
		
		String wordFile = "src/com/callor/word/word.txt";
		WordService wordService = null;
		
		try {
			wordService = new WordServiceImplV2(wordFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Scanner scan = new Scanner(System.in);
		int gameCount = 0;
		WordVO wordVO = wordService.getWord();
		
		while(true) {
			System.out.println("다음에 제시된 번역과 일치하는 영어 단어를 입력하세요");
			System.out.println("게임을 중단하려면 --QUIT 입력하세요");
			System.out.println(Line.sLine(100));
			System.out.println(wordVO.korean);
			System.out.println(Line.sLine(100));
			System.out.print("영단어>> ");
			String inputString = scan.nextLine();
			
			if(inputString.equals("--QUIT")) break;
			
			if(inputString.isBlank()) {
				System.out.println("영어 단어를 입력해 주세요");
				continue;
			}
			if(wordVO.english.equalsIgnoreCase(inputString)) {
				System.out.println("참 잘했어요");
				break;
			} else {
				System.out.println("다시 생각해 보세요");
				gameCount ++;
			}
			if(gameCount > 5) {
				System.out.println("5번의 기회를 모두 놓쳤네요");
				break;
			}
		}
		System.out.println("GAME OVER !!!");
		
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		String answer = "";
//		
//		WordVO word = wordService.getWord();
//		String kor = word.korea;
//		System.out.println("영단어 맞추기");
//		System.out.println("랜덤으로 단어를 추출했습니다.");
//		System.out.printf("뽑으신 단어의 한글번역은 %s입니다.\n ",kor);
//		
//		while(true) {
//			System.out.println("한글뜻과 동일한 영단어를 입력해주세요");
//			System.out.print(">> ");
//			answer = scan.nextLine().toLowerCase();
//			try {
//				if(answer.matches("[a-z]"));
//			} catch (Exception e) {
//				System.out.println("단어는 영어로만 입력해주세요");
//				continue;
//			}
//			break;
//		}
//		
//		if(answer.equals(word.english)) {
//			System.out.println("정답!");
//		}else {
//			System.out.println("오답!");
//		}
		
	}
}
