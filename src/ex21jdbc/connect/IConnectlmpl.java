package ex21jdbc.connect;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class IConnectlmpl implements IConnect {
	

	
	// 동적쿼리 처리를 위한 객체
	public Connection con; 
	public CallableStatement csmt;//오라클의 함수/프로시저를 실행하기 위한 객체

	public PreparedStatement psmt;
	public ResultSet rs;
	
	// 기본 생성자
	public IConnectlmpl() {
		
		System.out.println("IconnectImpl 기본생성자 호출");
	}
	// 인자 생성자 (매개변수 2개)
	public IConnectlmpl(String user , String pass) {
		System.out.println("IConnectImpl 인자생성자 호출");
		try {
			Class.forName(ORACLE_DRIVER);
			connect(user , pass);
			
		} 
		catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	// 인자생성자(매개변수 3개) - 오버로딩으로 생성자 선언
	public IConnectlmpl(String driver ,String user , String pass) {
		System.out.println("IConnectImpl 인자생성자 호출");
		try {
			Class.forName(driver);
			connect(user , pass);
			
		} 
		catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	@Override
	public void connect(String user , String pass) {
		try {
			con = DriverManager.getConnection(ORACLE_URL , user , pass);
		}
		catch(SQLException e) {
			System.out.println("데이터베이스 연결 오류");
			e.printStackTrace();
		}
	}
	/*
	오버라이딩의 목적으로 정의한 메소드. 쿼리 실행은 가가의 클래스에 진행하게 될 것이다.
	*/
	@Override
	public void execute() {
	// 하는 일이 없다.	
		
	}
	// 자원해제
	@Override
	public void close() {
		try {
			if(con!=null) con.close();
			if(psmt!=null) psmt.close();
			if(rs!=null) rs.close();
			System.out.println("자원 반납 완료");
		}
		
		catch(Exception e) {
			System.out.println("자원 반납시 오류 발생");
			e.printStackTrace();
		}
	}
	@Override
	public String scanValue(String title) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print(title + "을(를) 입력(exit->종료):");
		String inputStr = scan.nextLine();
		/*
		equalsIgnoreCas()
		equal() 메소드와 동일하게 문자열이 같은지 비교하는 메소드로 다른 점은 대소문자를 구분하지 않는다.
		*/
		if("EXIT".equalsIgnoreCase(inputStr)) {
			System.out.println("프로그램을 종료합니다.");
			close(); // 자원해제
			System.exit(0); // 프로그램 자체가 즉시 종료 된다.
		}
		
		return inputStr; // 입력 받은 문자열을 반환
		
	}
}