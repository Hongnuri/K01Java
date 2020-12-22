package quiz_game.k71.upgugu;

public class GungChan {

	public static void main(String[] args) {
		
		for (int dan=2 ; dan<=9 ; dan++)
		{
			int result=dan;
			for (int su=1 ; su<=9 ; su++)
			{
				if(su == 1)
				{
					System.out.printf("%dX1 = %d",dan ,dan);
					System.out.print("  ");
					System.out.println();
				}
				else
				{
					System.out.print(dan);
					for (int y=1 ; y<=9 ; y++)
					{
						if(su>y)
							System.out.print("X"+dan);
						else
							System.out.print("");
					}
					result *= dan;
					System.out.print(" = "+ result);
					System.out.println();
				}
			}
		}
		System.out.println();
	}
}
