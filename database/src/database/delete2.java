package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class delete2 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;

		Scanner sc = new Scanner(System.in);

		try {
			Class.forName("oracle.jdbc.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";

			con = DriverManager.getConnection(url, user, password);

			System.out.println("삭제할 부서번호 입력>> ");
			int deptno = sc.nextInt();

			// deptno = 55삭제
			String sql = "delete from dept_temp where deptno=?" + deptno;

			pstmt = con.prepareStatement(sql);
			// 세팅
			pstmt.setInt(1, deptno);
			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("삭제 성공");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
