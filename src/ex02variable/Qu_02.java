package ex02variable;
/*

문제2] 파일명 : Qu_02.java
국어,영어,수학 점수를 99, 80, 96점으로 입력하고 
평균점수를 구해서 출력하는 프로그램을 작성하시오.
출력결과]
	99점,80점,96점의 평균점수는 XXX.XX점입니다.(실수형태)
	99점,80점,96점의 평균점수는 XXX점입니다.(정수형태)
 */
public class Qu_02 {

	public static void main(String[] args) {
		
		int k=99, e=80, m=96;		
		double avg = (k + e + m) / 3.0;
		System.out.println("평균점수(실수형)="+ avg);
		System.out.println("평균점수(정수형)="+ (int)avg);

	}

}
