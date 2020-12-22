package bokang.quiz;

public class QuSusikAZ {

	public static void main(String[] args) {

		/*
		A : 0~9 사이의 정수
		Z : 0~9 사이의 정수
		단, A와 Z는 서로다른 정수이다.
		 */
		for(int A=0 ; A<=9 ; A++) {

			for(int Z=0 ; Z<=9 ; Z++) {

				/* A와 Z는 서로다른 정수이므로 같은값이 나올때는 아래
				코드를 실행하지않고 반복문의 처음으로 돌아간다. */
				if(Z==A) {
					continue;
				}

				int result = (A*10+Z)+(Z*10+A);

				//AZ + ZA = 99 조건에 맞는 모든 정수를 찾아야함
				if(result == 99) {
					System.out.printf("%d%d + %d%d = %d\n",
						A, Z, Z, A, result);
				}
			}
		}
















	}//end of main

}//end of class
