package bokang.review;

import java.util.Scanner;

/*
 static으로 선언된 변수/메소드는 컴파일러에 의해 클래스가 로드될때
이미 초기화되어 메소드영역에 올라간다.
 메소드영역에 로드된 static(정적) 메소드/변수는 객체생성없이
클래스명 만으로 접근이 가능하다. 
 즉 new 연산자를 통해 새로운 객체를 계속 생성하지 않고, 하나의 객체를
프로그램 전체에서 공유하는 공유메모리의 역활을 하게된다.
 */

class AddClass {
	/*
	키보드를 통한 입력을 받기 위해 Scanner클래스의 객체가 static(정적)
	변수로 선언되었다. 클래스 로드시 메소드영역에 초기화되어 프로그램
	전체에서 사용이 가능하다. 	
	 */
	public static Scanner scan = new Scanner(System.in);
	
	//정수 하나를 입력받아 출력하는 메소드
	public void inputNum() {		
		int num2 = scan.nextInt();
		System.out.println("입력받은 정수는:"+ num2);
	}	
}

public class R06Static {
	
	private String name;
	
	public R06Static() {
		System.out.println("나는 기본생성자");
	}	
	public R06Static(String n) {
		name = n;
		System.out.println("나는 인자생성자");
	}
	void showName() {
		System.out.println("나는 "+ name +" 이다.");
	}

	public static void main(String[] args) {
		
		System.out.println("===첫번째 객체생성===");
		R06Static stat1 = new R06Static();
		stat1.name = "코스모44기";
		stat1.showName();
		
		System.out.println("===두번째 객체생성===");
		new R06Static("홍길동").showName();		
		
		//Scanner scan = new Scanner(System.in);
		System.out.println("===main클래스에서 입력받기===");
		int num1 = AddClass.scan.nextInt();		
		System.out.println("입력한 정수는:"+ num1);
				
		System.out.println("===AddClass클래스에서 입력받기===");
		new AddClass().inputNum();
	}
}






