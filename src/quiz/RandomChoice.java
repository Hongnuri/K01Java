package quiz;

import java.util.Random;

public class RandomChoice {

	static final int RANDOM_COUNT = 100000000;//난수생성횟수
	//static final int STUDENT_COUNT = 28;//학생수
	
	public static void main(String[] args) {		
		
		
		String[] kosmo = {				
				"김소라","김지현",
				"남아영",
				"송혜주",
				
				"최용식","최현지","허서윤","허주희",
				
		};
		//난수를 누적해서 저장할 배열
		int[] choice = new int[kosmo.length];
		
		//난수생성을 위한 객체생성 및 씨드설정
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
				
		//일정횟수 반복하면서 난수생성
		for (int i=0 ; i<RANDOM_COUNT ; i++) {			
			int rndNumber = random.nextInt(RANDOM_COUNT);
			//학생수 만큼의 난수생성
			int stuNumber = rndNumber % kosmo.length;
			//System.out.println("comNumber="+stuNumber);
			//생성된 난수를 배열의 인덱스로 사용하여 +1증가
			choice[stuNumber]++;
		}
		
		for (int i=0 ; i<kosmo.length ; i++) {			
			System.out.printf("%s = %d\n", kosmo[i], choice[i]);
			//System.out.printf("%s[%d] = %d\n", kosmo[i], i, choice[i]);
		}
		
		int max=0;
		int maxIndex=-1;
		//배열에서 가장 큰값 찾기
		for (int i=0 ; i<kosmo.length ; i++) {			
			if(max<choice[i]) {
				max = choice[i];	
				maxIndex = i;
			}
		}
		
		System.out.println();
		System.out.println("선택된사람 : "+ kosmo[maxIndex]);
	}
}









//71기
		/* 발표한 사람은 여기로...ㅋ
		"서대진","유내길","김의수","오인호",
		"이찬희","이강민","홍진혁""남민우","이정후",
		*/
/*
 * 2차때 : "임수민","이학준","박종은","강현우","박상혁",
 * 결석 :"김지훈",
 *  
 * "김성준","손현승","송치영","안주용",
 * "남아영","김다은*","남궁찬","김다혜"
 * "김민지","홍진범",
 * 
*/
