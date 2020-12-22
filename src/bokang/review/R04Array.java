package bokang.review;
/**********************************

ex11static 까지 강의후 복습

 **********************************/
public class R04Array {

	//배열에 저장된 요소의 중복을 체크하는 메소드
	static boolean arrayExistElements(int[] arr) {
		
		//배열내 요소의 중복체크를 위한 변수
		boolean numFlag = true;
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr.length ; j++) {
				if(i!=j && arr[i]==arr[j]) {
					//중복발견
					numFlag = false;					
				}
			}
		}
		
		return numFlag;
	}
	

	//버블정렬
	static void bubbleSort(int[] arr) {
		
		/*
		버블정렬 : 배열의 요소를 순차적으로 비교하면서 swap(교환)하는
			정렬 알고리즘의 하나이다. 
		 */
		int temp ;//스왑을 위한 임시변수
		
		for(int i=0 ; i<arr.length ; i++) 
		{
			for(int j=0 ; j<(arr.length-1)-i ; j++) 
			{
				//앞자리숫자와 뒷자리숫자를 비교후 앞자리가 크면
				//뒷자리와 교환한다.
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	
	//난수생성 및 중복검사
	static void randomCreate(int[] lotto) {
		while(true)
		{
			//난수 6개 생성
			for(int i=0 ; i<lotto.length ; i++) {
				lotto[i] = (int)((Math.random()*1000) % 45) + 1;			
			}
			
			boolean isOverlap = arrayExistElements(lotto);
			if(isOverlap==false) {
				System.out.println("중복발생됨");
				continue;//난수 6개 다시생성
			}
			else {
				break;//생성완료이므로 while문 탈출
			}
		}		
	}
	
	
	//배열출력
	static void showArray(int[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");	
		}		
	}
	
	
	public static void main(String[] args) {		
		/*
		시나리오]1차원배열을 생성과 동시에 초기화하고 배열의 요소에
		중복값이 있는지 검사하는 프로그램을 작성하시오.
		중복이 없는경우에는 true, 중복이 있는경우에는 false를 반환한다.
		 */
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = {1,2,3,2,5};
		
		boolean isExist1 = arrayExistElements(arr1);
		if(isExist1==true) System.out.println("중복없음");
		else System.out.println("중복있음");
		
		boolean isExist2 = arrayExistElements(arr2);
		if(isExist2==true) System.out.println("중복없음");
		else System.out.println("중복있음");
		
		/*
		연습문제] 중복되지 않는 난수 6개를 생성하시오. 생성한 
		난수는 아래 배열에 채워 넣으시오.
		 */
		int[] lottoNum = new int[6];
		
		//난수생성 및 중복검사
		randomCreate(lottoNum);
		
		//배열출력
		System.out.println("버블정렬 전 출력");
		showArray(lottoNum);
		
		//버블정렬
		bubbleSort(lottoNum);
		
		System.out.println("\n버블정렬 후 출력");
		showArray(lottoNum);
		
	}//end of main

}
