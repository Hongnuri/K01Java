package bokang.review;
/**********************************

ex11static 까지 강의후 복습

 **********************************/
public class R05Class {

	public static void main(String[] args) {		

		//체크카드 클래스 Ver.01
		
		//객체생성
		CheckCard1 cc1 = new CheckCard1();
		//멤버변수 초기화
		/*
		숫자를 표현할때 구분자로 언더바(_)를 사용할수 있다.
		JDK7.0 부터 지원되었으며 숫자사이에 쓰는것만 허용한다.
		잘못된사용법]
			3._14159
			123_456_
			_124_456
			....
			위와같이 언더바로 시작하거나 끝날수 없으며 
			소수점과 붙여서 쓸수도 없다.		
		 */
		cc1.owner = "홍길동";		
		cc1.cardNumber = 1234_2222_3333_4444L;
		cc1.balance = 10000;
		cc1.point = 0;
		
		//멤버메소드 호출
		cc1.payment(5000);//5000원 결제		
		cc1.payment(10000);//10000원 결제
		cc1.showState();//현재상태보기
		
		/********************************************************************/
		
		//체크카드 클래스 Ver.02
		
		//기본생성자로 객체생성후 초기화메소드로 멤버변수 초기화
		CheckCard2 cc2 = new CheckCard2();
		cc2.initMembers(1234_4567_8901_2345L, "김말똥", 3000, 0);
		
		//인자생성자로 객체생성과 초기화를 동시에 처리
		CheckCard2 cc3 = new CheckCard2(9876_5432_1098_7654L, 
				"이말년", 100000, 5);
		
		//카드사용 및 충전
		cc2.charge(8000);
		cc2.payment(9000);
		cc2.showState();
		
		cc3.charge(50000);
		cc3.payment(15000);
		cc3.showState();		
		
		//멤버변수가 private으로 선언되었으므로 직접 접근 불가
		//cc2.balance = 10000;->에러발생
		//cc3.owner = "아무개";->에러발생
		
		//정보은닉된 멤버 접근시에는 setter를 통해서만 가능함
		cc2.setBalance(10000);
		cc3.setOwner("아무개");
		
		
		/********************************************************************/
		
		//체크카드 클래스 Ver.03
		
		CheckCard3 cc4 = new CheckCard3(123_4567_8901_2345L, 
				"앙데용", 120000, 0);
		cc4.payment(110000);//카드번호가 15자리로 빈객체 생성됨
		cc4.showState();
		
		
		CheckCard3 cc5 = new CheckCard3(1111_2222_3333_4444L,
				"정상적", 200000, 0);
		cc5.payment(110000);//11만원구매
		cc5.payment(20000);//2만원구매
		cc5.showState();//현재상태
		
		cc5.payment(1_000_000);//100만원구매		
	}

}







