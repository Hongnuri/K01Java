package bokang.review;

public class Navigation {
	//제조사
	String productName ;
	
	public Navigation(String p) {
		this.productName = p;
	}
	
	public void showNaviInfo() {
		System.out.println("네비제조사:"+ productName);
	}
}
