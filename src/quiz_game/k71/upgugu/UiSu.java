package quiz_game.k71.upgugu;

public class UiSu {

	public static void main(String[] args) {

		 for(int dan=2;dan<=9;dan++) {
	         int sum=dan;
	         for(int rows=1;rows<=9;rows++) {
	            if(rows==1) {
	               System.out.printf("%2d * 1 = %d",dan,dan*1);
	               System.out.println();
	               continue;
	            }
	            else {
	               System.out.printf("%2d",dan);
	               for(int cols=2;cols<=rows;cols++) {
	                  System.out.printf(" x%2d",dan);
	               }
	            }
	            sum*=dan;
	            System.out.printf(" =%2d",sum);
	            System.out.println();
	         }
		 }	         
	}
}
