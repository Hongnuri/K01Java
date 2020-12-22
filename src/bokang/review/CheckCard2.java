package bokang.review;

/*
체크카드 클래스 Ver.02

버전02에서 추가부분
	1. 멤버변수 초기화 메소드 정의 
		메소드명 : initMembers()
	2. 기본생성자, 인자생성자 정의
	3. 멤버변수 정보은닉
	4. getter/setter 메소드 추가
 */
public class CheckCard2 {
	//멤버변수]
	private long cardNumber;//카드번호
	private String owner;//소유자
	private int balance;//잔고
	private int point;//포인트	
	//생성자메소드]
	public CheckCard2() {}//기본생성자
	//인자생성자
	public CheckCard2(long cardNumber, String owner, int balance, int point) {
		 
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
	
	//초기화메소드
	public void initMembers(long cardNumber, String owner, int balance, int point) {
		 
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balance = balance;
		this.point = point;
	}
	
	
	//멤버메소드]	
	//충전(입금)
	void charge(int amount) {
		balance += amount;
		System.out.printf("[%s님 충전]%d원 완료\n", owner, amount);
		System.out.printf("[잔고]%d원 입니다\n\n", balance);
	}

	//결제
	void payment(int amount) {
		balance -= amount;
		System.out.printf("[%s님 결제]%d원 출금완료\n", owner, amount);
		System.out.printf("[잔고]%d원 입니다\n\n", balance);
		//결제금액의 0.1% 포인트 적립
		savingPoint(amount);
	}	
	
	//적립 	
	void savingPoint(int amount) { 
		int plusPoint = amount / 1000;
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
