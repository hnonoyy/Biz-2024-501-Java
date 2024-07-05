package com.callor.word.exec;

import com.callor.word.service.WordService;
import com.callor.word.service.impl.WordServiceImplV1;

public class WordExcA {

	public static void main(String[] args) {
		
		String wordFile = "src/com/callor/word/word.txt";
		WordService wordService = new WordServiceImplV1(wordFile);
	}
}
