package bokang.review;

/*
체크카드 클래스 Ver.01

시나리오] 체크카드를 클래스로 표현해보자.
	멤버변수 : 카드번호, 소유자, 잔액, 포인트
	멤버메소드 : 충전(입금), 결제, 적립, 현재상태출력
	적립율 : 사용금액의 0.1%	
*/
class CheckCard1 {
	
	//멤버변수]
	long cardNumber;//카드번호
	String owner;//소유자
	int balance;//잔고
	int point;//포인트
	
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
}
