package quiz_game.k71.upgugu;

public class HaeJu {

	public static void main(String[] args) {

		for (int st = 2; st <= 9; st++) {
			System.out.printf("%dX1=%d%n", st, st); // st*1=st
			for (int n = 1; n <= 8; n++) {
				int sum = st;
				System.out.print(st);
				for (int m = 1; m <= 9; m++) {
					if (n >= m) {
						System.out.print("x" + st);
						sum = sum * st;
					}

				}
				System.out.println("=" + sum);
			}
		}
	}
}
