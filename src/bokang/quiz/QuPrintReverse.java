package bokang.quiz;


/*
문제5) 1부터 100까지 출력하고 난 다음에, 다시 거꾸로 100에서 1까지
출력하는 프로그램을 작성해보자.
do~while문을 한번만 사용해서 구현한다.
 */
public class QuPrintReverse {

	public static void main(String[] args) {

		int reverse = 1;//전체 반복수만큼 증가하는 변수
		int printNum = 1;//실제 출력하는 변수

		do {
			System.out.print(printNum + " ");

			if(reverse<100) {//100보다 작거나 같을때
				printNum++;
			}
			else {//100보다 클때(101~102~....)
				printNum--;
			}

			if(reverse==100) {//100까지 출력한후 줄바꿈처리
				System.out.println();
			}

			reverse++;
		}while(reverse<200);

	}

}








