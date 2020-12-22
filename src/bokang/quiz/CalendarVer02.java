package bokang.quiz;

import java.util.Scanner;

//요일
interface WEEK_STR2
{
	int SUN=0, MON=1, TUE=2, WED=3, THU=4, FRI=5, SAT=6;
}


class CalendarVer02
{
	public static void main(String[] args)
	{
		int firstDayOfYear = 0;
		//각 월의 마지막날
		int[] lastDayOfmonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		//2016년1월1일은 금요일
		final int firstDay2016 = WEEK_STR2.FRI;

		String[] weekStr = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

		//윤년 판단위한 변수
		boolean leapYear;
		System.out.print("출력년도를 입력하세요:");
		Scanner sc = new Scanner(System.in);
		int inputYear = sc.nextInt();

		//윤년인지 판단..
		if(inputYear%4==0){
			leapYear = true;//윤년
		}
		else{
			leapYear = false;//일반년도
		}

		//입력된 년도의 1월1일이 무슨요일일까??
		if(inputYear==2016){
			firstDayOfYear = firstDay2016;
		}
		else
		{
			if(inputYear==2016){
				firstDayOfYear = firstDay2016;
			}
			else
			{
				//2016년이 아니라면 찾아보자...
				int firstTemp = firstDay2016;
				if(inputYear>2016)
				{
					for(int i=2017 ; i<=inputYear ; i++)
					{
						if((i-1)%4==0)
						{
							firstTemp = firstTemp + 2;
						}
						else
						{
							firstTemp = firstTemp + 1;
						}
						firstTemp %= 7;
					}
				}
				else
				{
					for(int i=2015 ; i>=inputYear ; i--)
					{
						if(i%4==0)
						{
							firstTemp = firstTemp - 2;
						}
						else
						{
							firstTemp = firstTemp - 1;
						}
						if(firstTemp<0) firstTemp+=7;
						firstTemp %= 7;
					}
				}
				firstDayOfYear = firstTemp;

				System.out.println(inputYear+"년의 첫날은? "+weekStr[firstDayOfYear]);
			}
		}

		int monthStart = 0;//매주의 시작은 일요일
		int weekNC = 0;//토요일이 되면 줄바꿈
		char spac = '_';

		for (int monCount = 0; monCount < 12; monCount++) //12월까지반복
		{
			if (monCount == 0) {//1월은 금요일부터 시작
				monthStart = firstDayOfYear;
			}
			else {//1월이 아니라면 지난달의 마지막 날 + 1
				monthStart = weekNC - 1;
			}

			System.out.printf("\n%d월\n", monCount + 1);
			for (int weekCnt = 0; weekCnt < 7; weekCnt++)
			{
				System.out.printf("%s\t", weekStr[weekCnt]);
			}
			System.out.printf("\n");

			//시작이 일요일이 아니라면 그만큼 공백을 출력해야 한다.
			for (int space = 0; space < monthStart; space++) {
				System.out.printf("%c\t", spac);
			}
			weekNC = monthStart + 1;

			//윤년이고 2월이면...+1
			if(leapYear == true && monCount==1){
				lastDayOfmonth[monCount]++;
			}
			for (int day = 1; day <= lastDayOfmonth[monCount]; day++) //날자
			{
				if (monCount + 1 == 11 && day == 30) {
					System.out.printf("생일");
				}
				else {
					System.out.printf("%d\t", day);
				}

				//토요일이 되면 줄바꿈
				if (weekNC == 7) {
					System.out.printf("\n");
					weekNC = 0;//줄바꿈하고나면 일요일로 리셋
				}
				weekNC++;

				if (day == lastDayOfmonth[monCount])
					break;
			}

			System.out.printf("\n");
		}
	}
}