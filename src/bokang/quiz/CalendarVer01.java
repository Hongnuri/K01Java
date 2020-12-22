package bokang.quiz;

//요일
interface WEEK_STR
{
	int SUN=0, MON=1, TUE=2, WED=3, THU=4, FRI=5, SAT=6;
}

class CalendarVer01
{
	public static void main(String[] args)
	{
		System.out.println("2016년 켈린더");

		//각 월의 마지막날
		int[] lastDayOfmonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		//2016년1월1일은 금요일
		int firstDayOfYear = WEEK_STR.FRI;

		String[] weekStr = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

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