package bokang.quiz;
/*
문제7) 자연수 1부터 시작하여 모든 홀수와 3의 배수인 짝수를 더해 나간다.
그리고 그 합이 언제 1000을 넘어서는지 그리고 1000을 넘어서 값은
얼마가 되는지 계산하여 출력하는 프로그램을 작성해보자.
단 while 문을 이용한다.
 */
public class QuExceed1000 {

	public static void main(String[] args) {

		int num = 1;//자연수 1부터 시작한다.
		int sum = 0;//누적합을 저장할 변수

		while(true) {
			//모든홀수 또는 3의배수인짝수
			if( num%2!=0 || (num%3==0 && num%2==0) ) {
				sum += num;
			}

			if(sum > 1000) {//1000을 초과할때..
				System.out.println(num +"을 더할때 1000을 넘게됨");
				System.out.println("초과된값:"+ sum);
				break;//while문을 탈출
			}

			num++;
		}















	}

}
