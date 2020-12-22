package bokang.quiz;

import java.util.Scanner;

public class QuPalindromeStr {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.print("회문인지 판단할 단어를 입력해주세요:");
		String str = scan.nextLine();
		
		boolean result = isPalindrome(str);		
		if(result==true)
			System.out.println("입력하신 단어는 회문입니다.");
		else 
			System.out.println("입력하신 단어는 회문이 아닙니다.");
	}
	
	public static boolean isPalindrome(String str) {
		
		boolean isPalindrome = true;
		char[] strArr = str.toCharArray();
		for (int j = 0; j < strArr.length; j++) {
			if(strArr[j]!=strArr[strArr.length-1-j]) {
				isPalindrome = false;
				break;
			}
		}
			
		return isPalindrome;
	}
}









