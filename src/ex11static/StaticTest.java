package ex11static;

class SingleClass {
	
	public static SingleClass single = new SingleClass();
	
	private SingleClass() {
		
	}
	
	public static SingleClass getInstance() {
		return single;
	}	
	
	public void showVar() {
		System.out.println("실행됨");
	}
}


class Sclass{
	
	int a = 10;
	static int b = 10;
	
	public Sclass() {
		a++;
		b++;
	}	
}

public class StaticTest {

	public static void main(String[] args) {
		
		Sclass s1 = new Sclass();		
		System.out.println("s1.a="+ s1.a); //=> 11
		//System.out.println("s1.b="+ s1.b);

		Sclass s2 = new Sclass();		
		System.out.println("s2.a="+ s2.a); //=> 11
		//System.out.println("s2.b="+ s2.b);

		Sclass s3 = new Sclass();		
		//System.out.println("s3.b="+ s3.b); //=> 11 

		Sclass s4 = new Sclass();		
		//System.out.println("s4.b="+ s4.b); //=> 12
		
		
		
		Sclass.b ++;
		System.out.println(Sclass.b);
		
		
		//SingleClass s = new SingleClass();
		SingleClass s = SingleClass.getInstance();
		s.showVar();
		
		
		

	}

}
