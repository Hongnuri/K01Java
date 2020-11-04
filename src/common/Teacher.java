package common;

public class Teacher extends Person  {

	String subject;
	
	public Teacher(String n , int a ,String sub) {
		
		super(n, a);
		
		subject = sub;
		
	}
	@Override
	public String getInfo() {
		
		return String.format("%s, 과목  %s" , super.getInfo(), subject );
	}
	
	@Override
	public void showInfo() {
		
		System.out.println(getInfo());
	}
}

