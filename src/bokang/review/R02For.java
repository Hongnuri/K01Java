package bokang.review;
/**********************************

ex11static 까지 강의후 복습

 **********************************/
public class R02For {

	public static void main(String[] args) {
		
		/*
		while문
			: 반복의 횟수가 명확하지 않을때 주로 사용하는 반복문
			
			형식				
				반복을 위한 변수의 초기값;
				while(조건식){
					실행문;
					while문 탈출을 위한 증감식;
				}			
		 */
		//1~10까지 10번 반복하면서 누적합을 구하는 while문
		int a = 1;
		int sum = 0;
		while(a<=10) {
			sum += a;
			a++;
		}
		System.out.println("1~10까지의 합은:"+ sum);
		
		/*
		do~while문
			: while문과는 다르게 일단 한번은 무조건 실행후
			탈출을 위한 조건을 체크한다.
			형식]
				초기값;
				do{
					실행문;
					증감식;
				}
				while(조건식);
		 */
		//위에서 제작한 1~10까지의 합을 구하는 while문을 do~while문으로
		//변경하시오
		int b = 1;
		int sum2 = 0;
		do {
			sum2 += b;
			b++;
		}
		while(b<=10);
		System.out.println("1~10까지의합:"+ sum2);
		
		/*
		for문 : 반복의 횟수가 정해져서 명확할때 주로 사용하는 반복문
			형식
				for(초기값 ; 조건식 ; 증감식){
					실행문;
				}
		 */
		int sum3 = 0;
		for(int c=1 ; c<=10 ; c++) {
			sum3 += c;
		}
		System.out.println("1~10까지의합을 for문으로:"+ sum3);
		
		
		/*
		연습문제] 두개의 주사위를 던졌을때 눈의 합이 6이되는 경우를
		모두 출력하는 프로그램을 for문과 if문을 이용하여 작성하시오.
		실행결과]
			1+5=6
			2+4=6
			.......
			5+1=6
		 */
		System.out.println("for문을 이용한 주사위문제 구현");
		for(int i=1 ; i<=6 ; i++) {
			for(int j=1 ; j<=6 ; j++) {				 
				if((i + j)==6) {
					System.out.printf("%d+%d=%d%n",i,j,(i+j));					
				}				
			}			
		}
		
		/*
		연습문제] 위 문제를 do~while문으로 변경하시오.
		 */
		System.out.println("do~while문을 이용한 주사위문제 구현");
		int m=1;//초기값;
		do {			
			int n=1;
			do {
				if((n+m)==6) {
					System.out.printf("%d+%d=%d%n",n,m,(n+m));
				}				
				n++;
			}
			while(n<=6);			
			m++;
		}
		while(m<=6);
		
		
		
		/*
		연습문제] 방정식 2x+4y=12를 만족하는 모든 x,y값을 구하시오.
		단, x,y의 범위는 0~10사이의 정수이고 while문을 통해
		구현하시오.
		실행결과]
			x=0, y=3
			x=2, y=2
			.......
		 */
		int x=0, y=0;
		while(x<=10) {			
			while(y<=10) {
				if(2*x + 4*y == 12) {
					System.out.printf("2x+4y=12를 만족하는 x,y:%d,%d%n"
							,x ,y);
				}
				
				y++;
			}
			y=0;//정상적인 반복을 위해 y값 초기화
			x++;
		}

	}

}






