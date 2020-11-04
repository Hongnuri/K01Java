package ex11static;

/*
static 블럭 : 실행되는 순서가 중요하다 !
동일 클래스 안의 main 메소드 보다 먼저 실행 되는 블럭으로 main 메소드의 실행코드가 없어도 먼저 실행된다.
단 , 다른 클래스에 main 이 있는 경우에는 main 이 순차적으로 실행 되다가 static 블럭이 있는 클래스가 객체화 될 때 , 실행된다.
이 때 , 생성자 보다 static 블럭이 먼저 실행 된다.
*/

public class StaticBlock
{
	// 인스턴스형 멤버
	int instanceVar;
	void instanceMethod() {}
		
	// 정적 멤버
	static int staticVar;	
	static void staticMethod()
		{
			int localVar;
			System.out.println("정적메소드");
		}
		
	// static 블럭
		static 
		{
			// 블럭 내에서 정적 멤버에 접근 가능
			staticVar = 1000;
			
			/*
			블럭 내에서만 사용할 수 있는 변수로서 이 때는 일반적인 변수를 생성할 수 있다.
			*/
			
			int localVar;
			localVar = 1000;
			System.out.println("localVar = " + localVar);
			
			// System.out.println("instanceVar = " + instanceVar); 에러발생
			// instanceMethod(); 에러발생
			// 인스턴스형 멤버는 블럭 내에서 접근할 수 없다
			//System.out.println("instanceVar=" + instanceVar); 에러발생
			// instanceMethod(); 에러발생
			
			System.out.println("staticVar = " + staticVar);
			staticMethod();
			System.out.println("=== static block ===");			
		}
		
		// 생성자메소드
		/*
		외부파일의 main 메소드에서 실행 되는 경우 해당 클래스의 객체가 생성자를 통해 생성되기 전에 static 블럭이 먼저 실행된다.
		그리고 하단의 public 은 객체화 되지 않아 출력도 안된다.
		*/
		public StaticBlock()
		{
			staticVar = -1;
			System.out.println("=== staticBlock 의 생성자 ===");
		}
		
		/*
		main 메소드가 외부파일에 있을 때 , 실행하기 위해 주석으로 처리함.
		주석으로 처리한 후 , E02StaticBlockMain.java 에서 실행할 것
		 */
//		public static void main(String[] args)
//		{
//			System.out.println("=== 메인메소드 ===");	
//			// static 블럭 내에서 선언 된 지역변수이므로 main 에서는 사용 불가
//			// System.out.println("localVar = " + localVar);
		}

