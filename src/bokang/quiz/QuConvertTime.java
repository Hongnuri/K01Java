package bokang.quiz;

import java.util.Scanner;

public class QuConvertTime {

	//시간, 분, 초는 변하지않는 수이므로 상수로 선언하는것이 좋다.
	static final int HOUR = 60*60;//1시간은 3600초
	static final int MIN = 60;//1분은 60초

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("시간으로 변환할 초(second)를 입력하세요:");
		int inputSec = scan.nextInt();
		convertSecToHMS(inputSec);

	}//end of main

	public static void convertSecToHMS(int sec) {

		//시, 분, 초를 저장하기 위한 지역변수 선언
		int h, m, s;

		/*
		sec = 3661 이라고 가정했을때
			3661 / 3600 = 1시간(몫)
			3661 % 3600 = 61초(나머지)

			61 / 60 = 1분(몫)
			61 % 60 = 1초(나머지)

			변환결과===>1시간 1분 1초
		 */

		//시 구하기
		h = sec / HOUR;
		sec = sec % HOUR;//시간을 구하고 남은 초(나머지)를 다시 담기

		//분 구하기
		m = sec / MIN;
		sec = sec % MIN;//분을 구하고 남은 초(나머지)를 다시 담기

		//초 구하기
		s = sec;

		System.out.printf("[%d시간 %d분 %d초]", h, m, s);

	}//end of convertSecToHMS

}//end of class









