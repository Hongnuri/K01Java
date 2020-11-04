package ex17collection;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import common.Teacher;

/*
HashSet컬렉션
: Set 계열의 인터페이스를 구현한 컬렉션으로
- 객체가 순서 없이 저장된다.
- 객체의 중복저장을 기본적으로 허용하지 않는다.
	단 , 기본클래스가 아닌 새롭게 정의한 클래스라면
	hashCode() , equals() 를 적절히 오버라이딩 해야한다.
- List 가 배열의 성격이라면 Set 은 집합의 성격을 가진다. 
*/

public class Ex04HashSet1 {

	public static void main(String[] args) {
		
		HashSet<Object> set = new HashSet<Object>();
		
		String strObject1 = "JAVA";
		String strObject2 = new String ("KOSMO71기");
		
		Date dateObject = new Date();
		int number = 100; // Integer 객체로 Boxing 처리 후 , 저장된다.
		
		Teacher teacher = new Teacher("김봉두" , 55 , "체육");
		
		/*
		3] 객체저장
		add() 를 통해 객체가 정상적으로 저장되면 true 를 반환한다. 
		*/
		System.out.println(set.add(strObject1)); // true 반환
		set.add(strObject2);
		set.add(dateObject);
		set.add(number); // new Integer(number) 생성 후 , 저장
		set.add(teacher);
		
		System.out.println("[중복 저장 전 객체수] : " + set.size()); // 5개 
		
		/*
		5-1] 기본 클래스형 객체 중복저장
		기본 클래스의 경우에는 별도의 오버라이딩 처리 없이 중복이 제거 된다.
		따라서 아래의 경우는 false 가 반환된다. 
		*/
		System.out.println(set.add(strObject2) ? "저장성공" : "저장실패");
		System.out.println("[중복(String) 저장 후 객체수] : " + set.size());
		
		/*
		5-2] 개발자가 정의한 객체 중복 저장
		직접 정의한 클래스인 경우 hashCode , equals 메소드를 오버라이딩 하지 않으면 중복 저장이 허용 된다.
		아래의 경우 저장에 성공하여 true 가 반환된다.
		*/
		Teacher teacher2 = new Teacher("김봉두" , 55 , "체육");
		System.out.println(set.add(teacher2) ? "성공" : "실패");
		System.out.println("[중복(teacher2) 저장 후 객체수] : " + set.size());
		
		/*
		6] 저장 된 객체 출력
		순서 없이 저장되므로 출력도 순서를 지정 할 수 없다.
		*/
		Iterator<Object> itr = set.iterator();
		while(itr.hasNext()) {
			
			Object object = itr.next();
			
			if(object instanceof String) {
				
				System.out.println("String타입 : " + object);
			}
			else if(object instanceof Date) {
				System.out.println("Date타입 : " + object);
			}
			
			else if(object instanceof Teacher) {
				System.out.println("Teacher타입 :" + ((Teacher)object).getInfo());
			}
			
			else { 
				
				System.out.println("님은 뭐임 ? -_-");
			}
		} // end of while

		
		// 1-7] 존재여부확인
		System.out.println(set.contains(strObject1) ? "strObject1 있다" : "strObject1 없다");
		System.out.println(set.contains("JAVA") ? "JAVA 있다" : "JAVA 없다");
		
		// 1-8] 삭제
		// Set 은 index 가 없으므로 참조 값만으로만 삭제 가능
		System.out.println(set.remove(strObject2) ? "strObject2 삭제 성공 " : "strObject 삭제 실패");
		System.out.println(set.remove("Android") ? "Android 삭제 성공 " : "Android 삭제 실패");
		System.out.println("[삭제 후 객체수]" + set.size());
		
		// 1-9] 전체 삭제
		// set.clear();
		System.out.println("전체삭제 : " + set.removeAll(set));
		System.out.println("[전체 삭제 후 객체수] : " + set.size());
 	}
}