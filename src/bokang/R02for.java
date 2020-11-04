package bokang;

public class R02for {

	public static void main(String[] args) {
		
		/*
		while문
		: 반복의 횟수가 명확하지 않을때 주로 사용하는 반복문
		형식]
			반복을위한변수;
			while(while문의 실행될 조건){
				실행문;
				while문 탈출을위한 증감식;(++ 혹은 --)
			}			
		 */
		//시나리오]1~10까지의 합을 구하는 while문을 작성하시오.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int a = 1;
//		
//		int sum = 0;
//		
//		while(a<=10) {
//			
//			sum += a;
//			
//			a++;
//		}
//		
//		System.out.println("1~10까지의합:"+ sum);
		
	
		
		/*
		do~while문
			: while문과는 다르게 일단 한번은 실행을 한후 
			탈출을 위한 조건을 체크한다. 
		형식]
			초기값;
			do {
				실행문; <- 해당 실행문은 무조건 1번은 실행된다.
				증감식;
			}
			while(조건식);			
		 */
		
		//시나리오] 1~10까지의 합을 구하는 do ~ while문을 작성하시오. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int b = 1;
//		int total = 0;
//		do {
//			total += b;
//			b++;
//		}
//		while(b<=10);
//		System.out.println("1부터 10까지의합:"+ total);
		
		
		
		
		
		/*
		for문
			: 반복의 횟수가 정해져서 명확할때 주로 사용하는 반복문.
		형식]
			for(반복을위한초기값 ; 반복을위한조건식 ; 증감식 ) {
				실행문;
			}
		 */
		/*
		★TEST★
		1~10까지의 합을 구하는 for문을 작성하시오.
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
//		int sum = 0; // for문 전에 합을 초기화 할 식을 넣는다.
//		
//		for(int i = 1 ; i <= 10 ; i++) {
		
//			sum += i;
//		}
//		System.out.println("1~10까지합은:"+ sum);
		
		/*
		★TEST★ 
		두개의 주사위를 던졌을때 눈의 합이 6이되는 경우를
		모두 출력하는 프로그램을 for문과 if문을 이용하여 작성하시오.
		실행결과]
			1+5=6
			2+4=6
			.......
			5+1=6
		 */
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("for문을 이용한 주사위문제 구현");
//		for(int i=1 ; i<=6 ; i++) {//주사위1(1~6까지)
//			for(int j=1 ; j<=6 ; j++) {//주사위2(1~6까지)				 
//				if((i + j)==6) {//두눈의 합이 6이될때만
//					//결과를 출력한다.
//					System.out.printf("%d+%d=%d%n",i,j,(i+j));					
//				}				
//			}			
//		}
		
		/*
		연습문제] 위 문제를 do~while문으로 변경하시오.		
		*/
		
		
		/*
		★TEST★
		방정식 2x+4y=12를 만족하는 모든 x,y값을 구하시오.
		단, x,y의 범위는 0~10사이의 정수이고 while문을 통해
		구현하시오.
		실행결과]
			x=0, y=3
			x=2, y=2
			.......
		 */
		
//	int x = 0;
//	while(x <= 10 ) {
//		int y = 0;
//		while(y <= 10) {
//			if((2*x) + (4*y) == 12) {
//			 	System.out.printf("2x+4y=12 를 만족하는 x,y:%d , %d\n" , x , y);
//				
//			
//			} y++;
//		} x++;
//	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int x = 0;
//		while(x<=10) { //x가 0~10사이
//			int y = 0;
//			while(y<=10) { //y가 0~10사이				
//				if((2*x)+(4*y)==12) {// 방정식에 만족할때..
//					//아래 문장 출력
//					System.out.printf("2x+4y=12를 만족하는x,y:%d, %d\n",
//							x, y);
//				}				
//				y++;
//			}			
//			x++;
//		}
//	
		
		System.out.println("====================================");
		/*
		연습문제) 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의
		결과를 계산하는 프로그램을 작성하시오.
		*/
		
		// 해법 1
//		int totalSum1 = 0;
//		int totalSum2 = 0;
		
		// 누적 할 2개의 식
		
//		for(int i = 1; i <= 10; i++) {
//			
//			totalSum1 += i; // 한 번 누적 했던 값을 ~
//			
//			totalSum2 += totalSum1; // 한 번 더 누적해서 더한다.
//			
//			System.out.println("totalSum2 = " + totalSum2);
		// 해법 2
		int totalSum3 = 0;
		for (int i = 1; i <= 10; i++) {
			for(int j=1; j <= i; j++) {
				totalSum3 += j;
			}
			
		}
		System.out.println("totalSum3 = " + totalSum3);
	}
		
			
	}


