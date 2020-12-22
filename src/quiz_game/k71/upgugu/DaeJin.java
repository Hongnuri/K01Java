package quiz_game.k71.upgugu;

public class DaeJin {

	public static void main(String[] args) {

		 for(int j = 2; j <=9; j++) {
	         
	         for(int z = 1; z <= 9; z++) {
	            int ans = j;
	            
	            if(z == 1) {
	               System.out.println(j + "*" + "1 = " + j*1);
	            }
	            else {
	               System.out.printf("%d", j);
	               for(int i = 2; i <=z; i++) {
	                  ans *= j;
	                  System.out.printf(" * %d",j);
	               }
	               System.out.printf(" = %d", ans);
	               System.out.println();
	            }
	         }
	      }
	}
}
