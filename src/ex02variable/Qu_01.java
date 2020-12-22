package ex02variable;

/*
문제1] 파일명 : Qu_01.java
1.국어, 영어, 수학점수 및 과목의 총점을 저장할수 있는 변수를 선언하시오.
2.국어 89점, 영어 99점, 수학 78점을 대입한다.
3.국영수 총합을 구해서 총점을 저장할 변수에 대입한다.
4.총합점수를 출력한다.
실행결과  	국어점수:XX점, 수학점수:XX점, 영어점수:XX점
 	3과목의 총점은 : XXX점
 */
public class Qu_01 {

	public static void main(String[] args) {
		 
		int k=89, e=99, m=78;
		int total;
		
		total = k + e + m;
		
		System.out.printf("국어:%d, 영어:%d, 수학:%d%n", k, e, m);
		System.out.println("총점:"+ total);	
	}

}
