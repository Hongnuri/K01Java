package bokang.quiz;

import java.util.Scanner;

public class QuFibonacciSeries {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("출력할 피보나치수열의 항목갯수를 입력하세요:");
		int fiboCount = scan.nextInt();

		//피보나치수열 출력을 위한 메소드 호출
		fibonacciFunc(fiboCount);

	}//end of main

	public static void fibonacciFunc(int fCount) {

		//피보나치 수열은 0과1부터 시작한다.
		int f1=0, f2=1, f3;

		if(fCount<=1) {
			System.out.println("피보나치수열은 0,1부터 시작이므로"
					+ " 항상 2이상 입력하셔야 합니다.");
		}
		else {
			//2이상의 숫자라면 먼저 0, 1부터 출력한다.
			System.out.printf("%d %d ", f1, f2);
		}

		//우선 fCount = 10을 입력한다고 가정하자...
		/*피보나치수열은 무조건 0,1부터 시작이므로 전체횟수에서 -2만큼의
		요소가 출력되어야 한다.*/
		for(int i=1 ; i<=fCount-2 ; i++) {
			//첫번째수와 두번째수를 더한후 곧바로 출력한다.
			f3 = f2 + f1;
			System.out.printf("%d ", f3);

			//f1, f2의 값을 새로운값(다음항목)으로 변경한다.
			f1 = f2;
			f2 = f3;

		}//end of for



	}

}//end of class











