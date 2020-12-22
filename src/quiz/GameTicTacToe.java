package quiz;

import java.util.Scanner;

public class GameTicTacToe {
	
	public static final int G_SIZE = 3;
	public static Scanner scan = new Scanner(System.in);

	//배열 초기화, 출력
	public static void arrayLoop(char[][] arr, String mode) {
		
		switch(mode) {		
		case "reset":
			for (int i = 0; i < G_SIZE; i++) 
				for (int j = 0; j < G_SIZE; j++)
					arr[i][j] = ' ';
			break;
		case "print":
			for (int i = 0; i < G_SIZE; i++) {
				System.out.println(" " + arr[i][0] + " | "
						+ arr[i][1] + " | " 
						+ arr[i][2]); 
				if (i != 2) 
					System.out.println("---|---|---");				
			}
			break;
		}////end of switch		
	}////end of arrayLoop()
	
	//사용자1,2가 번갈아가면서 입력	
	public static void toggleInput(char[][] arr, char tog) {
		
		while(true) {
			try {
				System.out.print("[사용자["+ tog +"]]좌표를 입력하세요(x,y):");
				int x = scan.nextInt();
				int y = scan.nextInt();
				
				//사용자입력 좌표 검증
				if(arr[x][y] == ' ') {
					//아직 입력되지 않았다면 입력..
					arr[x][y] = tog;
					break;
				}
				else {
					System.out.println("잘못입력하셨습니다.");			
				}
			}
			catch (Exception e) {
				System.out.println("예외발생됨");		
				scan.nextLine();
			}
		}		
	}

	//승패판단
	public static char winnerCheck(char[][] arr, char tog) {
		
		for (int i = 0; i < G_SIZE; i++) {
			//행 검사
			if(arr[i][0]==tog && arr[i][1]==tog && arr[i][2]==tog) {
				return tog;
			}
			//열 검사
			if(arr[0][i]==tog && arr[1][i]==tog && arr[2][i]==tog) {
				return tog;
			}				
		}	
		//대각선검사1
		if(arr[0][0]==tog && arr[1][1]==tog && arr[2][2]==tog) {
			return tog;
		}				
		//대각선검사2
		if(arr[0][2]==tog && arr[1][1]==tog && arr[2][0]==tog) {
			return tog;
		}		
		
		boolean allCheck = false; 
		//모든칸이 채워졌는데도 승부가 나지 않는 상태
		for (int i = 0; i < G_SIZE; i++) {
			for (int j = 0; j < G_SIZE; j++) {
				if(arr[i][j]==' ') {
					//채울곳이 남았다면 true로 변경
					allCheck = true;
				}
			}
		}
		if(allCheck==false) return 'R';
		
		//승패가 판단되지 않았을때는 스페이스를 반환
		return ' ';
	}
	
	
	public static void main(String[] args) {

		char[][] tBoard = new char[G_SIZE][G_SIZE];
		char toggleUser = 'O';

		
		//배열 초기화 및 출력
		arrayLoop(tBoard, "reset");
		arrayLoop(tBoard, "print");
		
		
		while(true) {
			 
			//입력하기
			toggleInput(tBoard, toggleUser); 
						
			//배열출력
			arrayLoop(tBoard, "print");
			
			//승부판단
			char endGame = winnerCheck(tBoard, toggleUser);
			
			//승자가 있으면 게임 끝
			if(endGame=='R') {
				//모든칸이 채워졌으나 승패가 안났다면 재시작
				System.out.println("승패가 나지않았으므로 재시작합니다.");
				//리셋
				arrayLoop(tBoard, "reset");
			}
			else if(endGame!=' ') {
				System.out.println(endGame +" 승");
				System.out.println("게임이 종료되었습니다.");
				break;
			} 
			
			//사용자 입력 토글
			if(toggleUser=='X') {
				toggleUser = 'O';
			}
			else {
				toggleUser = 'X';
			}			
		}
	}
}












