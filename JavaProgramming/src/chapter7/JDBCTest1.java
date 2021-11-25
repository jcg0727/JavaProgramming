package chapter7;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

//컨트롤+쉬프트+O 로 import문 숨김
public class JDBCTest1 {
	public static void main(String[] args) throws Exception {
		LprodDao dao = new LprodDao();
		  List<LprodVO> vos = dao.select();
		System.out.println("ID\t\t구분\t\t이름");
		for (LprodVO vo : vos) {
			System.out.println(vo.getLprodId() + "\t\t" + vo.getLprodGu() + "\t\t" + vo.getLprodNm());
		}
		
		
		
		
//		 //1. 드라이버 로딩
//		Class.forName("oracle.jdbc.driver.OracleDriver");
////		DriverManager.registerDriver(new OracleDriver());
//		
//		//2. DB에 접속
//		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "JCG92", "java"); //컨트롤+1 누르고 어사인 하여 커넥션 추가
//		
//		//3. 질의 명령 준비
//		Statement statement = connection.createStatement(); //컨트롤+1 누르고 어사인 하여
//		
//		//4. 명령 실행(질의 결과 수집)
//		ResultSet resultSet = statement.executeQuery("SELECT LPROD_ID, LPROD_GU, LPROD_NM FROM LPROD"); //컨트롤+1 누르고 어사인 하여		
//		// 참고 : insert, update, delete 
////		int executeUpdate = statement.executeUpdate("");
//		System.out.println("lprod_id\tlprod_gu\tlprod_nm");
//		while (resultSet.next()) {
//			System.out.print(resultSet.getInt("LPROD_ID") + "\t\t " );
//			System.out.print(resultSet.getString("LPROD_GU")+ "\t\t");
//			System.out.print(resultSet.getString("LPROD_NM")+ "\n");
//		}
//		
//		// 5. 종료(자원 반납)
//		resultSet.close();
//		statement.close();
//		connection.close();
//		
		
	}
}