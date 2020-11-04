package ex21jdbc;

import java.sql.Connection;
import java.sql.DriverManager; // 패키지는 반드시 java.sql 로 시작해야한다.
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

	public static void main(String[] args) {
		
	try {
		/*
		JDBC 프로그래밍 절차
		1] 오라클용 JDBC 드라이버를 메모리에 로드
		: new 를 사용하지 않고 , 클래스명으로 직접 찾아서 객체 생성 후 
		메모리에 로드하는 forName() 을 사용한다.
		메모리에 로드 된 드라이버가 Drivermanager 라는 클래스에 등록 된다. 
		*/
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		/*
		2] 오라클 연결을 위한 커넥션 URL , 계정 아이디 , 패스워드를 준비한다.
		커넥션 URL ->
			jdbc:oracle:thin:@IP주소:포트번호:SID
		서버환경에 따라 ip주소 , 포트번호 , sid 는 변경 될 수 있다.	
		*/
		
		String ur1 = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "hr";
		String usepw = "1234";
		
		/*
		2-1] DriverManager 클래스의 메소드를 통해 오라클에 연결을 시도한다.
		연결에 성공 할 경우 연결 된 주소를 반환한다. 
		*/
		Connection con = DriverManager.getConnection(ur1,userid,usepw);
		
		if(con!=null) {
			
			System.out.println("Oracle DB 연결 성공");
			
			/*
			3] 쿼리문 작성
				: 쿼리문을 작성할 때 , 주의할 점은 줄바꿈을 할 때 , 앞뒤로 스페이스를 삽입하는 것이 좋다.
				그렇지 않으면 문장이 이어지게 되어 SyntaxError 가 발생하게 된다.
			*/
			String sql = " SELECT * from employees WHERE "
					+ " department_id=50 "
					+ " ORDER BY employee_id DESC ";
			// " 다음에 글자는 앞 뒤로 무조건 띄어쓰자 !
			
			System.out.println("sql=" + sql);
			
			/*
			4] 쿼리문을 Oracle 로 전송하기 위한 Statement 계열의 인터페이스를 사용한다.
			해당 객체는 주로 정적 쿼리를 실행할 때 , 사용된다.
			*/
			Statement stmt = con.createStatement();
			
			/*
			5] Statement 객첼을 사용하여 Oracle 로 작성 된 쿼리문을 전송하고 실행한다. 
			실행 후 , 결과를 반환하면 ResultSet 객체를 통해 받는다.
			*/
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				/*
				오라클이 반환 해준 ResultSet 객체의 갯수 만큼 반복하면서 콘솔에 내용을 출력한다.
				getXXX() 계열의 함수는 문자 , 숫자 , 날짜를 사용하기 위해 생성되어있다. 
				인자값으로는 컬럼의 순서에 따른 인덱스를 쓸 수도 있고 , 컬럼명을 쓸 수도 있다.
				*/
				String emp_id = rs.getString(1); // employees_id 컬럼
				
				String f_name = rs.getString("first_name");
				
				String l_name = rs.getString(3); // last_name 컬럼
				
				java.sql.Date h_date = rs.getDate("hire_date");
				
				int sal = rs.getInt("salary");
				
				System.out.printf("%s %s %s %s %s%n" , emp_id , f_name , l_name , h_date , sal);
						
			}
			/*
			6] 자원반납 : 모든 작업을 마친 후에는 메모리 절약을 위해 연결했던 자원을 반납한다.
			*/
			rs.close();
			stmt.close();
			con.close();
		
		} else {
			
			System.out.println("연결 실패");
			
		}
	}
	catch(SQLException e) {
		System.out.println("SQLExeption 예외 발생");
		e.printStackTrace();
	}
	catch (ClassNotFoundException e) {
		System.out.println("ClassNotFoundException 예외 발생");
		e.printStackTrace();
	}
	catch(Exception e) {
		System.out.println("DB연결시 예외 발생");
		e.printStackTrace();
		
	}
	
}
	
}