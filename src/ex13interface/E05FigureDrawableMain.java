package ex13interface;

import ex13interface.figure.Circle;
import ex13interface.figure.IDrawable;
import ex13interface.figure.IFigure;
import ex13interface.figure.Rectangle;
import ex13interface.figure.Triangle;

public class E05FigureDrawableMain {
	
	public static void main(String[] args) {
	

	// 부모인터페이스의 참조변수로 자식객체를 참조하는 이질화 형태
	
	IFigure figure = new Circle(30);
	// 오버라이딩 되었으므;로 별도의 형변환 없이 즉시 호출 가능
	figure.area("원");
	((Circle)figure).draw("나도 원");
	
	IFigure fig1 = new Rectangle(100,90);
	fig1.area("사각형");
	((Rectangle)fig1).draw("사각형");
	
	IDrawable draw = new Triangle(100, 90);
	draw.draw("삼각형");
	((Triangle)draw).draw("삼각형");
	
	// Circle 참조변수가 동일 객체를 참조하는 동질화 형태
	Circle circle = new Circle(40);
	circle.area("원"); // 자기 자신 것이므로 접근가능
	circle.draw("나도 원"); // 자기 자신 것이므로 접근가능
	
	}
}