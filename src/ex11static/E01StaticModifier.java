package ex11static;

/*
static variable(정적변수)
- 멤버변수 앞에 static 지정자가 붙으면 정적변수가 된다.
- 정적변수는 JVM(자바가상머신) 에 의해 프로그램이 로드 되는 시점에 초기화 된다.

- main() 메소드가 실행 되기 전에 이미 초기화 되므로 main 메소드 실행시 별도의 선언 없이 변수를 사용할 수 있다.

접근방법
- 클래스 내부
	변수명으로 접근 가능(일반적인 멤버변수와 동일함)
	
- 클래스 외부 
	참조변수.변수명 or 클래스명.변수명
	둘 다 가능하다.
*/
class MyStatic
{
	/*
	멤버변수 : 인스턴스형 멤버변수는 반드시 클래스의 객체를 생성한 후 참조변수를 통해 접근해야한다.
	*/
	
	int instanceVar;
	/*
	정적멤버변수 : 객체를 생성할 필요 없이 클래스명으로 바로 접근이 가능하다. 프로그램이 시작시 이미 메소드 영역에 초기화 된다.
	*/
	static int staticVar;
	
	/*
	인스턴스형 멤버메소드 : 인스턴스형 메소드에서는 모든 멤버를 사용할 수 있다.
	인스턴스형 , 정적변수 둘 다 접근 가능하다.
	*/
	
	void instanceMethhod()
	{
		System.out.println("instanceVar = " + instanceVar);
		System.out.println("staticVar = " + staticVar);
		staticMethod();
	}
	
	/*
	정적 멤버메소드 : 정적메소드 안에서는 인스턴스 멤버를 사용 할 수 없다. 정적 멤버만 접근 가능하다.
	(메소드에서는 static 으로 선언 된 메소드만 호출 할 수 있었음을 기억하자)
	*/
	static void staticMethod()
	{
		// System.out.println("instanceVar = " + instanceVar); // 에러발생
		System.out.println("staticVar = " + staticVar);
		// instanceMethod(); // 에러발생
	}
}

public class E01StaticModifier 
{

	public static void main(String[] args) 
	{	
		/*
		일반적인 멤버변수에 접근하는 방법 ->
		MyStatic 클래스의 객체를 생성한 후 , 참조변수를 통해 접근한다.
		*/
		MyStatic myStatic = new MyStatic();
		
		myStatic.instanceVar = 100;
		System.out.println("myStatic.instanceVar = " + myStatic.instanceVar);
		
		/*
		static(정적) 멤버변수 접근방법
		방법1 : 클래스명을 통해서 접근한다. 객체 생성 없이 바로 접근이 가능하다.
		*/
		MyStatic.staticVar = 200;
		System.out.println("myStatic.staticVar = " + myStatic.staticVar);
		/*
		방법2 : 일반적인 멤버변수처럼 참조변수를 통해 접근하는 것도 가능하다.
		단 , 이 경우는 정적변수를 일반적인 멤버변수로 착각할 수 있으므로 자바에서 권장하지 않는다.
		*/
		MyStatic.staticVar = 300;
		System.out.println("myStatic.staticVar = " + myStatic.staticVar);
		
		MyStatic ms1 = new MyStatic();
		MyStatic ms2 = new MyStatic();
		/*
		인스턴스형 멤버변수는 객체별로 각각 존재하므로 아래 초기화 된 값은 객체별로 각각 저장된다.
		따라서 출력 결과는 100, 1000이 된다.
		*/
		ms1.instanceVar = 100;
		ms2.instanceVar = 1000;
		
		System.out.println("ms1.instanceVar = " + ms1.instanceVar);
		System.out.println("ms2.instanceVar = " + ms2.instanceVar);
		
		/*
		정적 멤버변수는 각각의 객체 마다 멤버변수가 존재하지 않고 , 메소드 영역에 하나만 생성되어 공유되므로 
		아래 대입문장은 하나의 변수에 값이 할당되게 된다. 따라서 결과는 둘 다 900이 출력 된다.
		*/
		MyStatic.staticVar = 800;
		MyStatic.staticVar = 900;
		
		System.out.println("ms1.staticVar = " + ms1.staticVar);
		System.out.println("ms2.staticVar = " + ms2.staticVar);
		
		/*
		정적 멤버메소드의 접근방법은 정적변수의 접근방법과 동일하다.
		*/
		myStatic.instanceMethhod();
		myStatic.instanceMethhod(); //권장사항이 아니므로 클래스명을 통해 접근하는 것이 좋음.
		
		// myStatic.instanceMethod(); 에러발생 : 참조변수를 통해서만 호출가능.
		myStatic.staticMethod();
	}
}