package bokang.quiz;

import java.util.Scanner;

public class QuBinaryNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("2진수로 변환할 정수를 입력하세요:");
		int inputNum = scan.nextInt();

		//2진수를 구하기위해 나머지를 저장할 배열
		int[] binaryNumArr = new int[100];
		//배열의 인덱스 카운트
		int arrIndex = 0;

		/*
		10진수->2진수로 변환하기 위해 2로 나눈 나머지를 배열에
		순서대로 저장한다.
		그리고 그 다음 연산을 위해 몫을 구해 변수에 저장한다.
		 */
		while(inputNum>0) {
			binaryNumArr[arrIndex++] = inputNum % 2;
			inputNum = inputNum / 2;
		}

		/*
		배열의 인덱스는 0부터 이므로 arrIndex가 0보다 클때까지
		반복하면서 나머지를 담은 배열의 역순으로 출력한다.
		 */
		while(arrIndex>0) {

			System.out.printf("%d", binaryNumArr[--arrIndex]);
		}

	}

}
