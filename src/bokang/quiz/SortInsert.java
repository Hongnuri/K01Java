package bokang.quiz;

class SortInsert
{
	public static void main(String[] args)
	{	
		int[] arr = { 9,7,5,3,2,4,1,6,8,10 };
	 
		//배열요소출력
		showArray(arr, -1);

		//정렬
		InsertSort(arr);
	}

	
	public static void showArray(int paramArr[], int re)
	{
		if (re >= 0) {
			System.out.print("Sort"+(re)+"번진행 : ");
		}
		else {
			System.out.print("배열보기 : ");
		}

		for (int i = 0; i < paramArr.length; i++)
		{
			System.out.print(paramArr[i]+" ");
		}
		System.out.println("");
	}
	
	public static void InsertSort(int[] paramArr)
	{
		int insData;
		int j;

		for (int i = 1; i < paramArr.length; i++)
		{
			insData = paramArr[i];

			for (j=i-1 ; j >=0 ; j--)
			{
				if (paramArr[j] > insData) {
					paramArr[j + 1] = paramArr[j];
				}
				else {
					break;
				}
			}
			paramArr[j + 1] = insData;
			
			showArray(paramArr, i);
		}
	}
}