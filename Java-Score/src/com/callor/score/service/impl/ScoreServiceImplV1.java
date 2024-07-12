package com.callor.score.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.models.ScoreDto;
import com.callor.score.service.ScoreService;
import com.callor.score.utils.Contract;
import com.callor.score.utils.Line;

/*
 * 생성자를 통해서 score.txt 파일의 경로 주입받기
 * Scanner 를 사용하여 파일을 읽을 수 있도록 준비
 * 클래스 영역에 List<ScoreDto> scoreList 객체 선언하기
 * 생성자에서 scoreList 객체 초기화 하기
 * loadScoreData() 에서 파일을 읽어 scoreList 객체 추가하기
 */

public class ScoreServiceImplV1 implements ScoreService {

	protected final String scoreFile;
	protected final List<ScoreDto> scoreList;
	protected String[] scoreTitle;
	protected final Scanner fileReader;

	public ScoreServiceImplV1(String scoreFile) throws FileNotFoundException {
		super();

		this.scoreFile = scoreFile;
		this.scoreList = new ArrayList<>();

		InputStream fileInput = new FileInputStream(this.scoreFile);
		this.fileReader = new Scanner(fileInput);
	}

	@Override
	public void loadScoreData() {
		scoreTitle = fileReader.nextLine().split(",");
		//fileReader.nextLine();
		while (fileReader.hasNext()) {
			String line = fileReader.nextLine();
			String[] lines = line.split(",");

			ScoreDto scoreDto = new ScoreDto();
			scoreDto.sc_num = lines[Contract.SCORE.학번];
			scoreDto.sc_kor = Integer.valueOf(lines[Contract.SCORE.국어]);
			scoreDto.sc_eng = Integer.valueOf(lines[Contract.SCORE.영어]);
			scoreDto.sc_math = Integer.valueOf(lines[Contract.SCORE.수학]);
			scoreDto.sc_music = Integer.valueOf(lines[Contract.SCORE.음악]);
			scoreDto.sc_art = Integer.valueOf(lines[Contract.SCORE.미술]);
			scoreDto.sc_sw = Integer.valueOf(lines[Contract.SCORE.소프트웨어공학]);
			scoreDto.sc_db = Integer.valueOf(lines[Contract.SCORE.데이터베이스]);

			this.scoreList.add(scoreDto);
		}
	}

	/*
	 * =================================== 
	 * 성적표 
	 * -----------------------------------
	 * 학번 국어 영어 수학 .... 총점 평균 
	 * -----------------------------------
	 * ===================================
	 */

	@Override
	public void printScoreList() {
		int[] subjectTotal = new int[8];
//		int korTotal = 0;
//		int engTotal = 0;
//		int mathTotal = 0;
//		int musicTotal = 0;
//		int artTotal = 0;
//		int swTotal = 0;
//		int dbTotal = 0;
//		float avgTotal = 0;
		System.out.println(Line.dLine(100));
		System.out.println("성적표");
		System.out.println(Line.sLine(100));
		//System.out.println("학번\t국어\t영어\t수학\t음악\t미술\tSW\tDB\t총점\t평균");
		for(String title : scoreTitle) {
			System.out.print(title + "\t");
		}
		System.out.println(" 총점\t평균\n"+Line.sLine(100));
		for (ScoreDto one : scoreList) {
//			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%.2f\n", one.sc_num, one.sc_kor,
//					one.sc_eng, one.sc_math, one.sc_music, one.sc_art, one.sc_sw, one.sc_db, one.total(),
//					one.average());
			System.out.printf("%5s\t",one.sc_num);
			System.out.printf("%4d\t",one.sc_kor);
			System.out.printf("%4d\t",one.sc_eng);
			System.out.printf("%4d\t",one.sc_math);
			System.out.printf("%4d\t",one.sc_music);
			System.out.printf("%4d\t",one.sc_art);
			System.out.printf("%4d\t",one.sc_sw);
			System.out.printf("%4d\t\t\t",one.sc_db);
			System.out.printf("%5d\t",one.total());
			System.out.printf("%.2f\n",one.average());
			
			subjectTotal[Contract.SCORE.국어] += one.sc_kor;
			subjectTotal[Contract.SCORE.영어] += one.sc_eng;
			subjectTotal[Contract.SCORE.수학] += one.sc_math;
			subjectTotal[Contract.SCORE.음악] += one.sc_music;
			subjectTotal[Contract.SCORE.미술] += one.sc_art;
			subjectTotal[Contract.SCORE.소프트웨어공학]+= one.sc_sw;
			subjectTotal[Contract.SCORE.데이터베이스] += one.sc_db;

//			korTotal += one.sc_kor;
//			engTotal += one.sc_eng;
//			mathTotal += one.sc_math;
//			musicTotal += one.sc_music;
//			artTotal += one.sc_art;
//			swTotal += one.sc_sw;
//			dbTotal += one.sc_db;
//			avgTotal += one.average();
		}
		System.out.println(Line.sLine(100));
		System.out.print("\t");
		float avgTotal = 0;
		for(int i=1; i< subjectTotal.length; i++) {
			float subjectAvg = (float)subjectTotal[i] / scoreList.size();
			System.out.printf("%.2f\t",subjectAvg);
			avgTotal += subjectAvg;
		}
		System.out.printf("\t\t\t%.2f", avgTotal / (subjectTotal.length -1));
		System.out.println("\n" + Line.dLine(100));
	}

}
