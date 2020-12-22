package bokang.quiz;

import java.util.Scanner;

public class QuPalindromeNum {

static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.print("회문인지 판단할 숫자를 입력해주세요:");
		int num = scan.nextInt();
		
		boolean result = isPalindrome(num);		
		if(result==true)
			System.out.println("입력하신 숫자는 회문입니다.");
		else 
			System.out.println("입력하신 숫자는 회문이 아닙니다.");
	}
	
	public static boolean isPalindrome(int number) {
	
		/*
		회문은 똑바로 읽어도 뒤집어 읽어도 똑같아야 하므로 주어진 숫자를
		뒤집어서 만든다. 제일 끝자리부터 숫자를 구해서 자리수를 올려준다.
		 */
		int temp = number;// 기존 숫자를 임시변수에 저장
		int makeNumber = 0;
		
		while(temp!=0) {
			//가장 뒷자리 숫자를 구하기 위해 %연산을 한다.
			int endNum = temp % 10;
			//해당 숫자를 더한다.
			makeNumber = (makeNumber*10) + endNum;
			//끝의 자리를 잘라내기 위해 10으로 나눈다.
			temp = temp / 10;
		}
		
		System.out.println("입력한정수를 뒤집어서 만든수="+ makeNumber);
		if(makeNumber==number)
			return true;
		else
			return false;
	}

}















