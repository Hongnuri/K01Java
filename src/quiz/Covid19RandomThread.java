package quiz;

import java.util.Random;

class iThread extends Thread {
	int[] choice;
	String[] kosmo;

	public iThread(int[] choice, String[] kosmo) {
		this.choice = choice;
		this.kosmo = kosmo;
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= Covid19RandomThread.STUDENT_COUNT; i++) {
				Covid19RandomThread.maxFind(choice, kosmo, i);
				if(Covid19RandomThread.STUDENT_COUNT==i)
					System.out.println("=========당첨 끄~~~읏=========");
				sleep(3000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Covid19RandomThread extends Thread {

	static final int RANDOM_COUNT = 100000000;// 난수생성횟수
	static final int STUDENT_COUNT = 3;// 당첨명수

	public static void main(String[] args) {

		String[] kosmo = { 
				"김지현",
				"유내길",
				"참송치영",
				"현승옹",
				"허서윤",
				"기호2번 홍진표",
				"갓김치맛있겠다훈",
				"김먼지",
				"kosmoCCTV",
				"임수민"
			};
		// 난수를 누적해서 저장할 배열
		int[] choice = new int[kosmo.length];

		// 난수생성을 위한 객체생성 및 씨드설정
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());

		// 일정횟수 반복하면서 난수생성
		for (int i = 0; i < RANDOM_COUNT; i++) {
			int rndNumber = random.nextInt(RANDOM_COUNT);
			// 학생수 만큼의 난수생성
			int stuNumber = rndNumber % kosmo.length;
			// System.out.println("comNumber="+stuNumber);
			// 생성된 난수를 배열의 인덱스로 사용하여 +1증가
			choice[stuNumber]++;
		}

		for (int i = 0; i < kosmo.length; i++) {
			System.out.printf("%s = %d\n", kosmo[i], choice[i]);
			// System.out.printf("%s[%d] = %d\n", kosmo[i], i, choice[i]);
		}
		iThread tr = new iThread(choice, kosmo);
		tr.start();
//      for (int i=0; i<STUDENT_COUNT; i++) {
//         maxFind(choice, kosmo);
//      }      
	}

	public static String maxFind(int[] choice, String[] kosmo, int cnt) {

		int max = 0;
		int maxIndex = -1;
		// 배열에서 가장 큰값 찾기
		for (int i = 0; i < choice.length; i++) {
			if (max < choice[i]) {
				max = choice[i];
				maxIndex = i;
			}
		}
		// 최대값을 찾은후 이름을 출력하고 0으로 리셋한다.
		System.out.println("당첨" + cnt + ":" + kosmo[maxIndex]);
		choice[maxIndex] = 0;
		return kosmo[maxIndex];
	}
}

//71기
/*
 * 발표한 사람은 여기로...ㅋ "서대진","유내길","김의수","오인호", "이찬희","이강민","홍진혁""남민우","이정후",
 */
/*
 * 2차때 : "임수민","이학준","박종은","강현우","박상혁", 결석 :"김지훈",
 * 
 * "김성준","손현승","송치영","안주용", "남아영","김다은*","남궁찬","김다혜" "김민지","홍진범",
 * 
 */