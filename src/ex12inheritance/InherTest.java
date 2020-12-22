package ex12inheritance;

class Aaaa{
	int num1;

	public Aaaa(int n) {
		num1 = n;
	}
}

class Bbbb extends Aaaa {
	int num2;

	public Bbbb(int n1, int n2) {
		super(n1);
		num2 = n2;
	}
	public void showB() {
		System.out.println(num1 +" "+ num2);
	}
}

public class InherTest {

	public static void main(String[] args) {

		Bbbb b = new Bbbb(99, 100);
		b.showB();
	}

}
