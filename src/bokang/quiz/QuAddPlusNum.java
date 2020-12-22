package bokang.quiz;

/*
문제9) 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의
결과를 계산하는 프로그램을 작성하시오.
 */
public class QuAddPlusNum {

	public static void main(String[] args) {

		int totalSum1 = 0;
		int totalSum2 = 0;
		int sum = 0;

		//방법1
		for(int i=1 ; i<=10 ; i++) {
			sum += i;
			totalSum1 += sum;
		}
		//방법2
		for(int i=1 ; i<=10 ; i++) {

			System.out.print("(");
			for(int j=1 ; j<=i ; j++) {

				//끝에 있는 + 기호 없애기
				if(i!=j) System.out.print(j +"+");
				else System.out.print(j);

				totalSum2 += j;
			}
			//계산식의 마지막 부분 = 기호 출력 처리
			if(i<10) System.out.print(")+");
			else System.out.println(")=");
		}
		System.out.println("=====================");

		System.out.println("결과값1:"+ totalSum1);
		System.out.println("결과값2:"+ totalSum2);
	}
}









