package quiz;

import java.util.Random;
import java.util.Scanner;

public class QuRockPaperScissors {

	public static void rpsGameStart() {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int gameCount = 0; // 게임 카운트용 변수
		
		
		while(true) {
			//1. 난수생성 - 컴퓨터입장에서 가위/바위/보
			int com = random.nextInt(10000) % 3 + 1;//1~3사이의 난수
			System.out.println("컴퓨터:"+ com);
			
			//2. 사용자입력 
			int user = 0;
			System.out.println("가위바위보를 입력하세요.");
			System.out.print("가위(1), 바위(2), 보(3)=>");
			
			try {
				user = scanner.nextInt();
			}
			catch (Exception e) {
				scanner.nextLine();
				e.printStackTrace();
			}
			
			//3.승부판단		
			//사용자가 정상적으로 입력한 경우
			if(!(user<1 || user>3)) {
				
				/*if(com==1&&user==1){
					System.out.print("사용자:가위,컴퓨터:가위\n비겼습니다.\n");
				}
				if(com==1&&user==2){
					System.out.print("사용자:바위,컴퓨터:가위\n이겼습니다.\n");
				}
				if(com==1&&user==3){
					System.out.print("사용자:보,컴퓨터:가위\n졌습니다.\n");
				}
		
				if(com==2&&user==1){
					System.out.print("사용자:가위,컴퓨터:바위\n졌습니다.\n");
				}
				if(com==2&&user==2){
					System.out.print("사용자:바위,컴퓨터:바위\n비겼습니다.\n");
				}
				if(com==2&&user==3){
					System.out.print("사용자:보,컴퓨터:바위\n이겼습니다.\n");
				}
		
				if(com==3&&user==1){
					System.out.print("사용자:가위,컴퓨터:보\n이겼습니다.\n");
				}
				if(com==3&&user==2){
					System.out.print("사용자:바위,컴퓨터:보\n졌습니다.\n");
				}
				if(com==3&&user==3){
					System.out.print("사용자:보,컴퓨터:보\n비겼습니다.\n");
				}
				*/
				
				//가위바위보 출력용 함수를 이용해서 정보출력
				System.out.printf("사용자:%s, 컴퓨터:%s ", 
						displayRPS(user), displayRPS(com));				
					
				switch(user - com) {
				case 0:
					System.out.println("비겼습니다.");break;
				case 1: case -2:
					System.out.println("이겼습니다.");break;
				case 2: case -1:
					System.out.println("졌습니다.");break;
				}
				
				gameCount++;//게임카운트 증가			
			}
			else {
				System.out.println("가위바위보 할줄 몰라요?? 제대로 내세요 ㅋ");
			}
			
			//게임재시작 여부 확인			 
			if(gameCount>=5) {				
				int restart;
				while(true) {
					System.out.print("게임재시작(1), 종료(0):");
					restart = scanner.nextInt();
					if(restart==0 || restart==1) {
						//정상입력이면 루프탈출
						break;
					}
					else {
						System.out.println("잘못입력해씸ㅜㅜ\n");
					}
				}								
				if(restart==0) {
					//게임종료를 위해 while루프 탈출
					break;
				}
				else {
					System.out.println("게임 재시작^^");
					gameCount=0;
				}
			}
		}//// end of while		
	}////end of rpsGameStart()
	
	public static String displayRPS(int n) {
		String str = "";
		switch(n) {
		case 1: str="가위";break;
		case 2: str="바위";break;
		case 3: str="보";break;
		}
		return str;
	}
	
	public static void main(String[] args) {

		rpsGameStart();
		
	}

}
