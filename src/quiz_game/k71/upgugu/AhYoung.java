package quiz_game.k71.upgugu;

public class AhYoung {

	public static void main(String[] args) {

		for(int dan=2;dan<=9;dan++) {
			
			int result=dan;
			
			System.out.printf("%dX%d=%d%n",dan,1,dan);
			
			for(int i=1;i<=8;i++) {
				System.out.printf("%d",dan);
				for(int times=1;times<=i;times++) {
					System.out.printf("X%d",dan);
				}
				result *= dan;
				
				System.out.printf("=%d%n",result);
			}			
		
			System.out.println("");			
		}
	}
}
