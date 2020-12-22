package bokang.review;

public class CarMain {

	public static void main(String[] args) {
		
		//자동차객체 생성
		Car car1 = new Car("정우성","12가9876",190, 50);
		Car car2 = new Car("유민하","34나3836",70);
		
		//자동차1 주행 
		car1.accelerator();
		car1.accelerator();
		car1.showCarInfo();
		
		//자동차2 주행
		for(int i=1 ; i<=20 ; i++) { //20번 주행 실행
			car2.accelerator();	
		}
		for(int i=1 ; i<=20 ; i++) { //20번 멈춤 실행
			car2.breaking();
		}
		car2.refueling(200);//200만큼 주유 실행
		car2.showCarInfo();
		
		
		//스포츠카 객체 생성
		SportsCar sCar1 = 
			new SportsCar("부가티", "강다니엘", "WannaOne1234", 0, 50);
		//sCar1.fuel = 300;//제약조건을 위반한 코드
		sCar1.setFuel(300);
		sCar1.showSportsCarInfo();
		
		//SUV객체 생성
		SUV suvCar1 = 
			new SUV("산타페", "낸시", "MomoLand1234", 0, 100);
		//suvCar1.speed = 500;//제약조건을 위반한 코드
		suvCar1.setSpeed(500);
		suvCar1.showSUVInfo();
		/*
		위 제약조건을 위반한 코드는 멤버변수의 "정보은닉"이 되지않아
		발생되는 문제이므로 "정보은닉"이 필요한 상황임.
		 */

		
		//스포츠카+네비+블랙박스
		SportsCar sCar2 = new SportsCar("카마로", "범블비", "Trans1234",
				0, 0, "만도", "8Gb");
		sCar2.showSportsCarInfo();
				
		//SUV+네비
		SUV suvCar2 = new SUV("스포티지", "메가트론", "디셉티콘9876", 
				0, 0, "카카오네비", "");
		suvCar2.showSUVInfo();		

	}

}
