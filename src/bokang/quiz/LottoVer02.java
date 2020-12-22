package bokang.quiz;

public class LottoVer02 {

	public static void setArrayRandom(int[] random, int start, int end){
		
		for(int i=0 ; i<random.length ; i++){			
			while(true){
				//랜덤하게 숫자 발생 시키자
				int randomNumber=(int)(Math.random()*(end-start+1))+start;
				
				//랜덤하게 발생시킨 숫자의 중복 여부체크를 위한 변수 선언
				boolean isDuplicated=false;
				
				//중복 여부 체크
				for(int k=0; k < random.length;k++){
					//중복된 경우
					if(randomNumber==random[k]){
						isDuplicated=true;
						break;
					}
				}		
				
				//중복되지 않은 경우
				if(!isDuplicated){
					//랜덤하게 발생시킨 숫자를 i번째 방에 저장
					random[i] =randomNumber;
					//while문 빠져 나가기
					break;
				}				
			}////end of while
		}////end of for
	}
	
	public static void showArray(int[] strArr, int count) {
		System.out.print(count+"번:");
		for(int i=0;i<strArr.length;i++){
			//System.out.printf("strArr[%d]=%s%n",i,strArr[i]);
			System.out.print(strArr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		for (int i = 1; i<=5; i++) {
			//난수생성
			setArrayRandom(lotto, 1, 45);
			//생성된 난수 출력
			showArray(lotto, i);
			//정렬			
		}
	}
}
