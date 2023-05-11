import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@DESKTOP-RSKB231:1521:XE";
        String user = "oe";
        String pass = "oe";
        
        Connection conn = DriverManager.getConnection(url,user,pass);
        if (conn != null) {
            System.out.println("Connected");
        }
        
	}

}
