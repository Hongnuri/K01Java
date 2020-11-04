package ex21jdbc.prepared;

public interface InsertSQL {
	
	String ORACLE_DRIVER = "oracle.jdbc.OracleDriver";
	String ORACLE_URL = "jdbc:oracle:thin://@localhost:1521:orcl";
	
	void connect(String user , String pass);
	void execute();
	void close();
	
	String scanValue(String title);
	
}
