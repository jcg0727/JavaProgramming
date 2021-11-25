package chapter7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class 연습 {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "JCG92", "java");
		Statement statement = connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery("SELECT LPROD_ID, LPROD_GU, LPROD_NM FROM LPROD");
		
		System.out.println("lprod_id\tlprod_gu\tlprod_nm");
		
		
		while(resultSet.next()) {
			System.out.print(resultSet.getInt("LPROD_ID") + "\t\t");
			System.out.print(resultSet.getString("LPROD_GU") + "\t\t");
			System.out.println(resultSet.getString("LPROD_NM"));
		}
		
		
		
	}	

}
