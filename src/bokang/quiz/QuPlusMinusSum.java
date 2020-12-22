package bokang.quiz;

/*
문제10) 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,
몇까지 더해야 총합이 100이상이 되는지를 구하는 프로그램을 작성하시오.
 */
public class QuPlusMinusSum {

	public static void main(String[] args) {

		//방법1]while문을 이용한 구현
		/*int sum = 0;//누적합을 저장할 변수
		int flag = 1;//부호를 바꿀때 사용할 변수
		int num = 1;

		while(true) {

			sum += (num * flag) ;
			flag = -flag;

			//누적합이 100이상이면 루프 탈출
			if(sum>=100) {
				break;
			}

			num++;
		}*/

		//방법2]for문을 이용한 구현
		int sum=0, flag=1, num=0;

		for(int i=1 ; true ; i++, flag=-flag) {

			System.out.println("flag="+ flag);

			num = flag * i;
			sum += num;

			if(sum>=100) break;
		}

		System.out.println("sum : "+sum);
		System.out.println("합이 100이상일때 num값 : "+ num);

	}

}









