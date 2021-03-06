package chapter7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

public class EmployeeDAO {
	public List<EmployeeDTO> selectEmployeeList() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "JCG92", "java");
		Statement statement = connection.createStatement();
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT ID, NAME, EMAIL, HP_NUMBER FROM EMPLOYEE");
		List<EmployeesVO> list = new ArrayList<EmployeesVO>();
		ResultSet resultSet = statement.executeQuery(builder.toString());
		while (resultSet.next()) {
			String id = resultSet.getString("ID");
			String name = resultSet.getString("NAME");
			String email = resultSet.getString("EMAIL");
			String hpNumber = resultSet.getString("NAME");
			list.add(new EmployeeDTO(id, name, email, hpNumber));
			
		}
		resultSet.close();
		statement.close();
		connection.close();
		}
	public EmployeesVO selectEmployee(int employeeId) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JCG92", "java");
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT ID, NAME, EMAIL, HP_NUMBER FROM EMPLOOYEE WHERE ID = ?");
		PreparedStatement statement = connection.prepareStatement(builder.toString());
		ResultSet resultSet = statement.executeQuery(builder.toString());
		statement.setString(1, usderId);
		if (resultSet.next()) {
			String id = resultSet.getInt("DEPARTMENT_ID");
			String departmentName = resultSet.getString("DEPARTMENT_NAME");
			String empId = resultSet.getString("EMPLOYEE_ID");
			String empName = resultSet.getString("EMP_NAME");
			vo = new EmployeesVO(departmentId, departmentName, empId, empName);
		}
		resultSet.close();
		statement.close();
		connection.close();
		return vo;
	}
	public void insertEmployee(EmployeeDTO dto) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JCG92", "java");
		Statement statement = connection.createStatement();
		StringBuilder builder = new StringBuilder();
		builder.append("INSERT INTO EMPLOYEE ");
		builder.append(" (ID, NAME, EMAIL, HP_NUMBER) ");
		builder.append( "VALUES ");
		builder.append(" ('" + dto.getId() + "', '" + dto.getName() + "', '" + dto.getEmail() + "', '" + dto.getHpNumber() + "')");
		//executeQuery : select
		//executeUpdate : insert, update, delete
		int result = statement.executeUpdate(builder.toString()); 
		if (result>0) {
			System.out.println("?????? ??????");			
		}else {
			System.out.println("?????? ??????");
		}
		statement.close();
		connection.close();
	}
	public void updateEmployee(EmployeeDTO dto) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JCG92", "java");
		String sql = "update employee set name = ?, email = ?, hp_number = ? where id = ?";	
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, dto.getName()); //setStirng()??? ????????? ??????????????? ??????
		statement.setString(2, dto.getEmail()); //setInt()??? ?????????????????? ?????? ?????????.
		statement.setString(3, dto.getHpNumber());
		statement.setString(4, dto.getId());
		statement.executeUpdate();
		//statement ??????
		int result = statement.executeUpdate();
		if (result > 0) {
			System.out.println("?????? ??????");
		}else {
			System.out.println("?????? ??????");
		}
		statement.close();
		connection.close();
	}
		public void deleteEmployee(String id) throws Exception {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JCG92", "java");
			String sql = "delete from employee where id = ?";	
			PreparedStatement statement = connection.prepareStatement(sql);	
			statement.setString(1, id);
			//statement ??????
			int result = statement.executeUpdate();
			if (result > 0) {
				System.out.println("?????? ??????");
			}else {
				System.out.println("?????? ?????? ?????? : ????????? ???????????? ????????????.");
			}
			statement.close();
			connection.close();
	
		}
		

	
}