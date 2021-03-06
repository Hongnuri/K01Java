package bokang.review;
/**********************************

ex11static 까지 강의후 복습

 **********************************/
import java.util.Scanner;

/*
제어문(조건문)
 */

public class R01if {

	public static void main(String[] args) {
		
		/*
		if문 단독사용		
		 */
		int num1 = 10;
		int num2 = 20;
		if(num1<num2) {
			System.out.println("num1이 num2보다 작다");
		}
		
		//위 문장을 if~else문으로 변경하면...
		if(num1>num2) {
			System.out.println("num1은 num2보다 크다");
		}
		else {
			System.out.println("num1은 num2보다 작다");
		}
		/*
		주의]조건은 항상 if문 뒤에 나오게 된다.
		else문 뒤에는 조건이 들어가지 않는다.
		 */
		
		//학점구하기를 if ~ else if ~ else 구문으로 표현하시오.
		/*
		90점이상 : A학점
		80점이상~90점미만 : B학점
		나머지는 : F학점
		 */
		int jumsu = 85;
		if(jumsu >= 90) {
			System.out.println("A학점 입니다.");
		}
		else if(jumsu>=80 && jumsu<90) {
			//점수의 구간을 정할때는 반드시 논리AND(&&)가 되어야한다.
			System.out.println("B학점 입니다");
		}
		else {
			System.out.println("F학점 입니다");
		}
		
		
		//switch
		/*
		형식
			switch(정수식 또는 산술식){
				case 값1:
					실행문1;
					break;
				........
				default:
					나머지실행문;
			}
		 */
		/*
		시나리오] 월에 해당하는 1~12까지의 숫자를 입력받아서
			봄(3~5), 여름(6~9), 가을(10~11), 겨울(12~2)인지 판단하는 
			switch~case문을	작성해보시오.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("1~12사이의 정수를 입력해주세요:");
		int month = scan.nextInt();
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("3~5월은 봄입니다.");
			break;
		case 6: case 7: case 8: case 9:
			System.out.println("6~9월은 여름입니다.");
			break;
		case 10: case 11:
			System.out.println("10~11월은 가을입니다");
			break;
		default:
			System.out.println("12~2월은 겨울입니다.");		
		}

	}

}






