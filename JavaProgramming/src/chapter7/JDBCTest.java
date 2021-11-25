package chapter7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//컨트롤+쉬프트+O 로 import문 숨김
public class JDBCTest {
	public static void main(String[] args){
		ResultSet resultSet = null; 
		Statement statement = null;
		Connection connection = null;
		 try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
//		DriverManager.registerDriver(new OracleDriver());
			
			//2. DB에 접속
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "JCG92", "java");
			
			//3. 질의 명령 준비
			statement = connection.createStatement();
			
			//4. 명령 실행(질의 결과 수집)
			resultSet = statement.executeQuery("SELECT LPROD_ID, LPROD_GU, LPROD_NM FROM LPROD");
			// 참고 : insert, update, delete 
//		int executeUpdate = statement.executeUpdate("");
			System.out.println("lprod_id\tlprod_gu\tlprod_nm");
			while (resultSet.next()) {
				System.out.print(resultSet.getInt("LPROD_ID") + "\t\t " );
				System.out.print(resultSet.getString("LPROD_GU")+ "\t\t");
				System.out.print(resultSet.getString("LPROD_NM")+ "\n");
			}
			
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// 5. 종료(자원 반납)
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}		
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}				
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}			
			}	
		}
	}
}
