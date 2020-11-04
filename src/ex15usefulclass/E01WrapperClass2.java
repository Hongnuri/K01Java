package ex15usefulclass;

public class E01WrapperClass2 {
	
	public static void main(String[] args) {
		
		/*
		1. parseInt() : 
		숫자형식의 문자열을 숫자로 변경한다. 주로 웹에서 많이 사용된다.
		*/
		String strNumber = "1000";
		
		System.out.println("10+strNumber =" + (10+strNumber)); // 101000
		System.out.println("10+strNumber를 숫자로 변경 : " + (10 + Integer.parseInt(strNumber))); // 1010
		System.out.println("10+strNumber를 숫자로 변경 : " + (10 + Integer.valueOf(strNumber))); // 동일한 기능
		
		/*
		문자열을 숫자로 변경할 때는 반드시 숫자형식만 와야한다.
		"원" 은 숫자가 아니므로 예외가 발생된다. 
		*/
		String money = "120원";
		// System.out.println("120원 : " + Integer.parseInt(money)); // 예외발생
		
		/*
		실수형태의 문자열을 실수로 변경할 때는 parseInt()는 사용할 수 없고
		parseFloat()를 사용해야한다.
		*/
		String floatString = "3.14";
		// System.out.println(Integer.parseInt(floatString)); 에러발생

		System.out.println("실수형(float)형으로 변경 : " + Float.parseFloat(floatString));
		System.out.println("실수형(Double)형으로 변경 : " + Double.parseDouble(floatString));
		
		// Charactor 클래스의 주요메소드
		/*
		2. codePointAt() :
		문자열에서 특정 index 에 해당하는 문자의 아스키코드 값을 반환한다.
		*/
		System.out.println("ABCD 3번 째 인덱스 D 의 아스키코드");
		System.out.println(Character.codePointAt("ABCD" , 3)); // 68
		
		/*
		3. isDigit() : 인자로 전달 된 문자가 숫자인지 판단. 숫자일 때 , true 반환.
		 */
		System.out.println("isDigit()를 통한 숫자판단");
		System.out.println(Character.isDigit('A')?"숫자임" :"숫자아님"); // false
		System.out.println(Character.isDigit(50)?"숫자임" : "숫자아님"); // true
		System.out.println(Character.isDigit('7')? "숫자임" : "숫자아님" ); // true
		
		/*
		4. isLetter() : 문자여부를 판단하는 특수기호나 숫자형은 false 를 반환한다.
		*/
		System.out.println("isLetter()메소드를 통한 문자판단");
		System.out.println(Character.isLetter('가')); // true
		System.out.println(Character.isLetter('A')); // true
		System.out.println(Character.isLetter('#')); // false
		System.out.println(Character.isLetter('9')); // false
		
		/*
		5. isWhitespace() : 공백문자인지 판단하여 true 를 반환한다.
		*/
		System.out.println("isWhitespace()메소드로 공백문자 판단");
		System.out.println(Character.isWhitespace('A'));
		System.out.println(Character.isWhitespace(' ')); // true
		
		/*
		6. 대소문자를 판단하는 메소드 : 영문자에만 적용되고 알파벳이 아닌 경우 무조건 false 를 반환한다.
		*/
		System.out.println("알파벱 대소문자 판단");
		System.out.println(Character.isLowerCase('A')); // false
		System.out.println(Character.isLowerCase('z')); // false
		System.out.println(Character.isLowerCase('a')); // true
		System.out.println(Character.isLowerCase('Z')); // true
		System.out.println(Character.isLowerCase('가')); // false
		
		/*
		시나리오 : 주어진 문자열 안에 몇 개의 공백문자(스페이스)가 있는지 판단하는 프로그램을 작성하시오
		참고: toCharArray() : 문자열을 char형 배열로 반환해주는 String클래스에 정의 된 메소드
		*/
		
		String whiteString = " H     E    L       L O ";
		
		int whiteCount = 0;
		// 주어진 문자열을 char 형 배열로 변환한다.
		char[] chArr = whiteString.toCharArray();
		// 배열의 크기 만큼 반복한다.
		for(int i = 0; i < chArr.length ; i++) {
			// 각 index 의 문자가 공백인지 검사한다.
			if(Character.isWhitespace(chArr[i])) {
				// 공백문자이면 +1 증가한다.
				whiteCount++;
			}
		}
		
		System.out.println("총공백수 : " + whiteCount);
	}	
}