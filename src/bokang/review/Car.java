package bokang.review;

import java.beans.FeatureDescriptor;

/*
자동차를 표현하는 클래스
	1.기본속성(멤버변수)
		차주, 차량번호, 속도, 연료 
	 
	2.멤버변수 초기화(생성자)   
	  
	3.기능(멤버메소드)
	  	브레이크 : 속도가 줄어든다. 연료소모는 없다.
	  	엑셀레이터 : 속도가 증가한다. 연료소모는 -20
	  	주유(연료보충) : 전달된 매개변수만큼 보충함.
	4.제한조건(연습문제)
	   속도 : 0~200km/h 즉 음수가 될수없고, 200을 초과할수 없음
	   연료 : 0~100ℓ
	   
	   -멤버메소드 주유, 브레이크, 엑셀에 제한조건을 충족할수
	   있는 조건식을 삽입하시오.
 */
public class Car {
	//1.멤버변수
	String owner;
	String carNumber;
	private int speed; 	//해당 멤버변수는 private으로 선언하여
	private int fuel; 	//정보은닉 한다.
	
	//문제에서 주어진 제약조건은 정해진 값이므로 상수로 선언하는것이 좋다.
	final int MAX_SPEED = 200;
	final int MAX_FUEL = 100;
	
	//getter/setter
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		//제약조건이 최대 200이므로 그보다 큰값은 200으로 고정하여 설정
		if(speed > MAX_SPEED) {
			speed = MAX_SPEED;
		}		
		this.speed = speed;
	}
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		//제약조건이 최대 100이므로 그보다 큰값은 100으로 고정하여 설정
		if(fuel > MAX_FUEL) {
			fuel = MAX_FUEL;
		}
		this.fuel = fuel;
	}
	
	
	//2.생성자메소드 : 해당 클래스를 객체화 하는 역할을 담당한다.
	/*
	디폴트생성자
		: 클래스를 정의할때 개발자가 생성자를 정의하지 않으면
		컴파일러가 자동으로 만들어주는 생성자이다. 
		단, 개발자가 생성자를 하나라도 정의하면 디폴트생성자는
		만들어지지 않는다. 
	 */
	//기본생성자
	public Car() {}
	
	//인자생성자1
	public Car(String owner, String n, int s, int f) {
		/*
		this : 해당 클래스를 가르키는 키워드
			사용법]
				this.멤버변수			
		 */
		this.owner = owner;
		this.carNumber = n;
		speed = s;
		fuel = f;		
	}
	//인자생성자2(오버로딩 처리)-자동생성메뉴
	public Car(String owner, String carNumber, int fuel) {
		
		this.owner = owner;
		this.carNumber = carNumber;
		this.fuel = fuel;
		speed=0;//자동차 객체가 생성될때 속도는 무조건 0
	}	
	
	
	//3.멤버메소드
	//주유하기
	public void refueling(int amount) {
		fuel += amount;
		
		//주유시 최대치를 초과하는지 검증
		if(fuel>MAX_FUEL) {
			System.out.println("연료의 최대치 "+ MAX_FUEL 
					+"을 초과하였습니다.");
			//최대치를 초과한 경우 최대값으로 값을 맞춰준다.
			fuel = MAX_FUEL;
		}
		
		System.out.println(amount +"만큼 주유되었습니다.");
	}
	
	//브레이크
	public void breaking() {
		speed -= 20;
		
		if(speed<0) {
			System.out.println("속도는 음수가 될수 없습니다.");
			speed = 0;
			System.out.println("브레이크:속도 0Km/h");
		}
		else {
			System.out.println("브레이크:속도 20Km/h 감소");
		}		
	}
	//엑셀레이터
	public void accelerator() {
		
		//연료가 없다면 주행불가
		if(fuel<=0) {
			System.out.println("연료가 없으므로 주행할수 없습니다.");
			return;
		}
		else {		
			speed += 20;
			fuel -= 10;
			
			//연료부족시에도 주행불가
			if(fuel < 0) {
				System.out.println("연료가 부족하므로 주행할수 없습니다.");
				speed = 0;
				fuel = 0;
				return;
			}
			
			//현재속도가 최대치를 초과하는지 검증
			if(speed>MAX_SPEED) {
				System.out.println("최대속도를 초과하여 고정됩니다.");
				speed = MAX_SPEED;
			}
			
			System.out.println("엑셀레이터:속도 20Km/h 증가");
			System.out.println("연료 10ℓ 감소");
		}
	}
	//자동차 정보 출력
	public void showCarInfo() {
		System.out.printf("차주:%s\n차량번호:%s\n연료:%dℓ\n속도:%dKm/h\n",
				owner, carNumber, fuel, speed);
	}
}





