package bokang.review;

public class BlackBox {

	String mCapacity ;
	
	public BlackBox(String c) {
		this.mCapacity = c;
	}
	
	public void showBoxInfo() {
		System.out.println("블렉박스의 메모리용량:"+ mCapacity);
	}
}
