package ex19thread;
/*
동기화 블럭
메소드 전체를 동기화 하지 않고 코드 중에 필요한 부분만 동기화하는 방식으로 동기화 메소드에 비해 성능이 우수하다.
형식
void myFunc() {
	synchronized(열쇠로 사용할 객체) {
		동기화 할 코드;
		
}
*/
/*
동기화 메소드
여러 쓰레드에 의해 호출되는 공유 메소드를 동기화 하여 여러 쓰레드가 동시에 접근하지 못하도록 Lock 을 거는 것을 말한다.

형식]
접근지정자 synchronized 반환 타입 메소드명() { 
실행문장;
}
*/
class MethodSyncClass
{
	synchronized void increase(int seed, int inc) {
		for(int i=1 ; i<=10 ; i++) {
			seed += inc;
			System.out.println(
				String.format("쓰레드명:%s,씨드값:%d"
					, Thread.currentThread().getName()
					, seed)
			);
			/*
			메소드 자체가 동기화 처리되었으므로 쓰레드 실행중에 sleep() 을 만나더라도 다른 쓰레드는 접근하지 못한다.
			*/
			try {
				Thread.sleep(300);
			}
			catch(InterruptedException e) {}
		}
	}
}

class MethodSyncThread extends Thread
{
	MethodSyncClass msc;
	int seed, inc;
	public MethodSyncThread(String threadName,
		MethodSyncClass msc, int seed, int inc) {

		super(threadName);
		this.msc = msc;
		this.seed = seed;
		this.inc = inc;
	}

	@Override
	public void run() {
		msc.increase(seed, inc);
	}
}

public class Ex05Sync3Method {

	public static void main(String[] args) {

		MethodSyncClass msc = new MethodSyncClass();

		MethodSyncThread t1 =
			new MethodSyncThread("1st쓰레드", msc, 10, 2);
		MethodSyncThread t2 =
			new MethodSyncThread("2nd쓰레드", msc, 10, 5);
		
		t1.start();
		t2.start();
	}
}