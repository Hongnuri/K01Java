package bokang.quiz;

/*
연습문제]두개의 주사위를 던졌을때 눈의 합이 6가되는 경우의 수를
모두 출력하는 프로그램을 for문과 if문을 사용하여 작성하시오.

출력예]
	1+5=6
	2+4=6
	.....
	5+1=6

위 프로그램을 작성후 주석처리하고 do~while문으로 변경하시오	
 */
public class QuDice6 {

	public static void main(String[] args) {
		
		/*for(int i=1 ; i<=6 ; i++) {
			for(int j=1 ; j<=6 ; j++) {
				
				if((i+j)==6) {
					System.out.printf("%d+%d=%d\n",i,j,(i+j));
				}				
			}
		}*/
		
		int i=1;
		do {
			int j=1;
			do {
				if((i+j)==6) {
					System.out.printf("%d+%d=%d\n",i,j,(i+j));
				}
				j++;
			}
			while(j<=6);		
			i++;
		}
		while(i<=6);
	}
}
