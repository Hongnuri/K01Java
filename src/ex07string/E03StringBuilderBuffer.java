package ex07string;

public class E03StringBuilderBuffer 
{
/*
String Buffer 클래스
: string 클래스는 내부 메소드를 이용해서 새로운 문자열을 생성하면 원래 문자열은 변하지 않고 새롭게 생성된 메모리에 문자열을 저장한다.
기존 메소리가 소멸되고 새로운 메모리가 생성되는 낭비를 막기위해  StringBuffer 클래스가 사용된다. 
해당 클래스는 새로운 메모리를 생성하지 않고 기존 메모리의 문자열을 변경한다.
 */
	public static void main(String[] args) 
	{
		/*
		append()
		: 문자열의 끝에 새로운 문자열을 연결한다.
		insert()
		: 지정한 인덱스 위치에 문자열을 삽입한다.
		 */
		
		StringBuffer strBuf = new StringBuffer("AB");
		strBuf.append(25);
		strBuf.append("Y").append(true);
		System.out.println("strBuf = " + strBuf);
		
		strBuf.insert(2, false);
		strBuf.insert(strBuf.length(), 'Z');
		System.out.println("strBuf = " + strBuf);
		
		System.out.println("String 과 StringBuffer 의 " + "참조값 비교");
		String str1 = "코스모";
		String str2 = "코스모";
		
		if(str1 == str2)
			System.out.println("연결 전 : 주소값 동일"); // [출력]
		else 
			System.out.println("연결 전 : 주소값 다름");
		
		str1 = str1 + "영원하라";
		if(str1==str2)
			System.out.println("연결 후 : 주소값 동일");
		else 
			System.out.println("연결 후 : 주소값 다름"); // [출력]

		StringBuffer buf = new StringBuffer();
		System.out.println("buf=" + buf);
		System.out.println("저장 된 문자열 크기 :" + buf.length());
		System.out.println("기본 버퍼 크기" + buf.capacity());
		
		buf.append("KOSMO");
		System.out.println("buf = " + buf);
		System.out.println("저장 된 문자열 크기 : " + buf.length());
		System.out.println("기본 버퍼 크기 : " + buf.capacity());
		
		buf.append(" 금일은 StringBuffer 공부 중이다.").append(" 오늘은 수욜이다.");
		System.out.println("buf = " + buf);
		System.out.println("저장 된 문자열 크기 " + buf.length());
		System.out.println("기본 버퍼 크기 : " + buf.capacity());
		
	}

}
