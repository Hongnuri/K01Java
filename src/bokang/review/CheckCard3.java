package bokang.review;

/*
체크카드 클래스 Ver.03
	: initMembers 초기화 메소드는 삭제처리 
	
	1.충전은 10000원 단위로만 가능하다.
	만약 5000원을 충전하면 충전불능으로 처리한다.
	
	2.잔고가 부족하면 결제불능으로 처리해야 한다.
	
	3.카드번호 생성시 0으로 시작할수 없고 전체자리수는 16자리여야
	한다.
	
	4.생성자 오버로딩 처리
		new CheckCard2(카드번호, 소유자, 잔고, 포인트);
		new CheckCard2(카드번호, 소유자, 잔고); => 포인트 0으로 초기화
		new CheckCard2(카드번호, 소유자); => 잔고, 포인트 0으로 초기화
	
	5.포인트 적립율 변경
		10만원 이하결재 : 0.1%적립
		10만원 초과결재 : 0.3%적립
 */
public class CheckCard3 {
	//멤버변수]
	private long cardNumber;//카드번호
	private String owner;//소유자
	private int balance;//잔고
	private int point;//포인트	
	//생성자메소드]
	public CheckCard3() {}//기본생성자
	//인자생성자
	public CheckCard3(long cardNumber, String owner, int balance, int point) {
		 
		boolean boolCardNum = cardNumberRange(cardNumber);
		if(boolCardNum==false) {
			System.out.println("카드생성불능");
			return;
		}
		
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balance = balance;
		this.point = point;
	}	
	/*
	생성자메소드와 멤버메소드의 유일한 차이점은
		생성자는 반환값이 없고,	멤버메소드는 반환값이 있다. 
		따라서 멤버메소드를 정의할때는
		반드시 void 혹은 해당 반환타입을 명시해야한다.
	 */
	
	
	public boolean cardNumberRange(long cn) {
		if(cn>=1000_0000_0000_0000L && cn<=9999_9999_9999_9999L) 
			return true;
		else
			return false;
	}
	
	//멤버메소드]	
	//충전(입금)
	void charge(int amount) {
		
		//충전은 10000원단위로만 처리가능
		if(amount%10000!=0) {
			System.out.println("[충전불능]10000원단위로만 처리가능");
			return;
		}
		
		balance += amount;
		System.out.printf("[%s님 충전]%d원 완료\n", owner, amount);
		System.out.printf("[잔고]%d원 입니다\n\n", balance);
	}

	//결제
	void payment(int amount) {
		
		//잔고부족시 결제불능
		if(balance<amount) {
			System.out.println("[결제불능]잔고부족");
			return;
		}		
		
		balance -= amount;
		System.out.printf("[%s님 결제]%d원 출금완료\n", owner, amount);
		System.out.printf("[잔고]%d원 입니다\n\n", balance);
		//결제금액의 0.1% 포인트 적립
		savingPoint(amount);
	}	
	
	//적립 	
	void savingPoint(int amount) {
		
		int plusPoint = 0;
		
		//적립율 변경
		if(amount>100000) {
			plusPoint = amount / 3000;
		}
		else {
			plusPoint = amount / 1000;	
		}
		
		point += plusPoint;
		System.out.printf("[적립]%d포인트 완료\n", plusPoint);
		System.out.printf("[포인트잔액]%d 입니다\n\n", point);
	}	
	
	//현재상태출력
	void showState() {
		System.out.println("=============================");
		System.out.println("카드번호:"+cardNumber);
		System.out.println("소유자:"+owner);
		System.out.println("잔고:"+balance);
		System.out.println("포인트:"+point);
		System.out.println("=============================");
	}
	//getter/setter 메소드 생성
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}	
}
