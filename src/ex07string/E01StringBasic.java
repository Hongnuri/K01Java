package ex07string;

public class E01StringBasic 
{

	public static void main(String[] args) 
	{
		int num1 = 10, num2 = 20;
		String numResult = (num1 == num2) ? "데이터가 길다" : "데이터가 다르다";
		System.out.println("비교 결과 : " + numResult);
		
		/*
		String 클래스의 객체 생성방법 1
		: new 를 이용한다. new 를 사용하면 동일한 문자열이라도 항상 새로운 메모리를 할당하게 된다.
		 */
		String str1 = new String("Hello JAVA");
		String str2 = new String("Hello JAVA");
		
		/*
		str1 , str2 는 String 객체의 참조 값을 가지고 있으므로 아래는 단순한 참조값에 비교를 진행한다.
		 */
		
		if (str1 == str2) {
			System.out.println("str1 과 str2 는 참조주소 같음");
		}
		else {
			System.out.println("str1 과 str2 는 참조주소 다름");
		}
		
		/*
		★ equals() 메소드
		: 	object 클래스로부터 상속 받은 메소드로 실제 저장 된 문자열을 비교하도록 만들어진 메소드이다.
			즉 , 아래는 객체 실제 저장 된 문자열에 대한 비교가 이루어진다.
		*/
		
		if(str1.equals(str2)) 
		{
			System.out.println("두 문자열은 동일하다");
		}
		else 
		{
			System.out.println("두 문자열은 다르다");
			
		}
		
		/*
		String 클래스의 객체 생성 방법 2 : 
		"(더블쿼테이션) 을 사용한다.
		이 경우 내용이 동일하다면 같은 주소를 사용하게 된다. 
		 */
		
		String str3 = "KOSMO";
		String str4 = "KOSMO";
		
		// 내용에 대한 비교를 한다. (동일하다.)
		System.out.println("equals() 메소드로 문자열 비교 : " + str3.equals(str4));
		
		/*
		자바에서 물자열 객체를 생성할 때 , new 를 사용하지 않고 , 
		" 를 사용하면 동일한 문자열인 경우 메모리를 하만 사용하여 공유하게 된다.
		 */
		if(str3==str4)
		{
			System.out.println("주소가 같다");
		} else 
		{
			System.out.println("주소가 다르다");
		}
	}
}
