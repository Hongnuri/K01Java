package bokang.quiz;

import java.util.Random;

public class LottoVer01 {

	public static void setArrayRandom(int[] random, int start, int end){
		
		Random rnd = new Random();
		
		while(true) {
			boolean isDup = true;//동일한 값이 있는지 확인
			//난수 6개 무조건 생성후 배열 삽입
			for (int i = 0; i < random.length; i++) {
				random[i] = rnd.nextInt(10000) % end + start;
			}
			//중복되는지 확인
			for (int i = 0; i < random.length; i++) {
				for (int j = 0; j < random.length; j++) {
					//인덱스는 다르면서 같은 값이 있는지 확인
					if(i!=j && random[i]==random[j]) 
						isDup = false;
				}
			}
			//중복되는 숫자가 없다면 루프 탈출
			if(isDup==true) break;
		}		
	}
	
	public static void showArray(int[] strArr) {
		for(int i=0;i<strArr.length;i++){
			//System.out.printf("strArr[%d]=%s%n",i,strArr[i]);
			System.out.print(strArr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {		
		int[] lotto = new int[6];
		//난수생성
		setArrayRandom(lotto, 1, 45);
		//생성된 난수 출력
		showArray(lotto);
		//정렬		
	}

}
