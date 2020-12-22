package quiz_game.k71.upgugu;

public class SeoYun {

	public static void main(String[] args) {

		inputGugudan(2, 9);
	}

	static void inputGugudan(int sNum, int eNum) {

		for (int dan = sNum; dan <= eNum; dan++) {
			int result = dan;

			for (int su = 1; su <= eNum; su++) {

				if (su == 1) {
					System.out.printf("%d * 1 = %d\n", dan, result);
				}
				else {
					result *= dan;
					for (int num = 1; num <= su - 1; num++) {
						System.out.printf("%d * ", dan);
					}
					System.out.printf("%d = %d\n", dan, result);
				}

			}

		}

	}

}
