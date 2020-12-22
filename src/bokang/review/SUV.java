package bokang.review;

public class SUV extends Car {
	
	//멤버변수
	String suvName;
	
	//멤버변수 : 차량용품추가
	Navigation navi;
	BlackBox box;
	
	//생성자
	public SUV(String suvName, String o, String n, int s, int f) {
		super(o, n, s, f);
		this.suvName = suvName;
	}
	
	//네비, 블렉박스 추가로 생성자 추가정의됨
	public SUV(String suvName, String o, String n, int s, int f, 
			String nProduct, String bCapacity) {
		super(o, n, s, f);
		this.suvName = suvName;
		
		if(!nProduct.equals("")) {
			navi = new Navigation(nProduct);
		}
		if(!bCapacity.equals("")) {
			box = new BlackBox(bCapacity);
		}
	}	
	
	//멤버메소드
	public void showSUVInfo() {
		super.showCarInfo();
		System.out.println("SUV명:"+ suvName);
		//네비게이션이 장착되었는지 검증
		if(navi==null) {
			System.out.println("Navigation이 없습니다.");
		}
		else {
			navi.showNaviInfo();
		}
		//블렉박스가 장착되었는지 검증
		if(box==null) {
			System.out.println("BlackBox가 없습니다.");
		}
		else {
			box.showBoxInfo();
		}
	}
}







