package bokang.sub;
/*
체크카드 클래스 Ver.03
	: initMembers 초기화 메소드는 삭제처리 
	
	1.충전은 10000원 단위로만 가능하다.
	만약 5000원을 충전하면 충전불능으로 처리한다.
	
	2.잔고가 부족하면 결제불능으로 처리해야 한다.
	
	3.카드번호 생성시 0으로 시작할수 없고 전체자리수는 16자리여야
	한다.(보류)
	
	4.생성자 오버로딩 처리
		new CheckCard3(카드번호, 소유자, 잔고, 포인트);
		new CheckCard3(카드번호, 소유자, 잔고); => 포인트 0으로 초기화
		new CheckCard3(카드번호, 소유자); => 잔고, 포인트 0으로 초기화
	
	5.포인트 적립율 변경
		10만원 이하결재 : 0.1%적립
		10만원 초과결재 : 0.3%적립
 */
public class CheckCard3 {
	//멤버변수
	private long cardNumber;
	private String owner;
	private int balance;
	private int point;
	
	//카드번호가 정상인지 확인하기위한 메소드
	public boolean cardNumberRange(long cn) {
		if(cn>=1000_0000_0000_0000L &&
				cn<=9999_9999_9999_9999L)
			return true;
		else
			return false;
	}
	
	public void initMembers(long cardNumber, String owner, int balance, int point) {
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balance = balance;
		this.point = point;
	}
	/*
	 생성자메소드와 멤버메소드의 유일한 차이점은
	 	생성자는 반환값이 없고, 멤버메소드는 반환값이 있다. 
	 	따라서 멤버메소드를 정의할때는 반드시 void 혹은  반환타입을
	 	명시해야 한다.
	*/	
	//기본생성자
	public CheckCard3() {}
	//인자생성자
	public CheckCard3(long cardNumber, String owner, int balance, int point) {
		//카드번호의 자리수가 틀릴경우 생성불능 처리
		if(cardNumberRange(cardNumber)==false) {
			System.out.println("카드생성불능");
			return;
		}
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balance = balance;
		this.point = point;
	}
	public CheckCard3(long cardNumber, String owner, 
			int balance) {
		//카드번호의 자리수가 틀릴경우 생성불능 처리
		if(cardNumberRange(cardNumber)==false) {
			System.out.println("카드생성불능");
			return;
		}
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balance = balance;
		this.point = 0;
	}
	public CheckCard3(long cardNumber, String owner) {
		//카드번호의 자리수가 틀릴경우 생성불능 처리
		if(cardNumberRange(cardNumber)==false) {
			System.out.println("카드생성불능");
			return;
		}
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balance = 0;
		this.point = 0;
	}
	/*
	멤버변수가 private으로 선언되면 클래스내부에서만 접근가능하므로
	외부에서의 접근을 위해 getter/setter를 필수적으로 생성해야한다. 
	*/
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
	//멤버메소드	
	//충전
	public void charge(int amount) {
		
		if(amount%10000!=0) {
			System.out.println("충전불능:10000원단위만가능");
			return;
		}		
		
		//잔고에 충전할 금액을 더한다.
		this.balance += amount;
		
		System.out.printf("[%s님 충전]%d원 완료\n", owner, amount);
		System.out.printf("[잔고]%d원 입니다\n\n", balance);
	}
	//결제
	public void payment(int amount) {
				
		if(this.balance < amount) {
			System.out.println("잔고부족으로 결재불능");
			return;
		}
		
		//잔고에서 결제할 금액만큼 차감된다.
		this.balance -= amount;
		//카드를 사용할때 적립금이 발생하게되므로 호출해준다.
		savingPoint(amount);
		
		System.out.printf("[%s님 결제]%d원 출금완료\n", owner, amount);
		System.out.printf("[잔고]%d원 입니다\n\n", balance);
	}
	//적립
	public void savingPoint(int amount) {
		double plusPoint = 0;
		if(amount>100000) {			
			plusPoint = (amount * 0.3);			
		}
		else {
			plusPoint = (amount * 0.1);
		}
		this.point += plusPoint;	
		
		System.out.printf("[적립]%d포인트 완료\n", plusPoint);
		System.out.printf("[포인트잔액]%d 입니다\n\n", point);
	}
	//현재상태출력(멤버변수)
	public void showState() {
		System.out.println("========================");
		System.out.println("카드번호:"+ cardNumber);
		System.out.println("소유자:"+ owner);
		System.out.println("잔고:"+ balance);
		System.out.println("포인트:"+ point);
		System.out.println("========================");
	}	
}




