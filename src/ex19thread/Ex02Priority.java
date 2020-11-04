package ex19thread;

/*
쓰레드의 우선순위
setPriority(우선순위) : 쓰레드의 우선순위를 지정할 때 , 사용
getPriority() : 쓰레드의 우선순위를 반환 할 때 , 사용
*/
class MessageSendingThread extends Thread {
	
	String message;
	
	// 생성자 1
	public MessageSendingThread(String str) {
		
		message = str;
	}
	
	// 생성자 2 : 멤버변수와 우선순위까지 초기화 한다.
	public MessageSendingThread(String str , int pri) {
		
		message = str;
		
		setPriority(pri);
	}
	
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			
			System.out.println(message + i + "(" + getPriority() + ")");
			/*
			기본적으로 우선순위가 높은 쓰레드가 먼저 실행되지만 
			sleep() 메소드를 사용하게 되면 실행 중 , 잠깐씩 블럭상태로
			전환 되어 우선순위가 낮은 쓰레드도 가끔 실행될 수 있는 상황이 생기게 된다.
			*/
			try {
				
				sleep(1); // 0.001초 동안 블럭상태로 전환된다.
			}
			
			catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Ex02Priority {

	public static void main(String[] args) {
		
		/*
		1단계 실행
		우선순위를 부여하지 않은 상태로 쓰레드를 생성하면 동일한 우선순위 5를 부여받게 된다. 
		이 때는 CPU 가 알아서 작업을 분배한다.
		*/
//		MessageSendingThread tr1 = new MessageSendingThread("첫 번재 ");
//		MessageSendingThread tr2 = new MessageSendingThread("두 번재 ");
//		MessageSendingThread tr3 = new MessageSendingThread("세 번재 ");
		
		/*
		2단계 실행
		우선순위 부여를 위해 정수를 사용한다.
		우선순위는 1~10 사이에서 부여할 수 있고 , 높을수록 우선순위도 높아지게 된다.
		(단 , 우선순위가 높다고 무조건 먼저 실행되지는 않는다. 전체적인 확률이 높아지게 되어 먼저 실행 된 가능성이 높아진다고 생각하면 된다.)
		*/
//		MessageSendingThread tr1 = new MessageSendingThread("첫 번재 " , 10);
//		MessageSendingThread tr2 = new MessageSendingThread("두 번재 " , 5);
//		MessageSendingThread tr3 = new MessageSendingThread("세 번재 " , 1);
		
		/*
		3단계 실행
		정수 대신 static(정적) 상수를 사용하여 우선순위를 부여할 수도 있다.
		*/
		MessageSendingThread tr1 = new MessageSendingThread("첫 번재 " , Thread.MAX_PRIORITY);
		MessageSendingThread tr2 = new MessageSendingThread("두 번재 " , Thread.NORM_PRIORITY);
		MessageSendingThread tr3 = new MessageSendingThread("세 번재 " , Thread.MIN_PRIORITY);
		
		tr1.start();
		tr2.start();
		tr3.start();
		
	}
}