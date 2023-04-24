package user.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import user.domain.UserDTO;

// ~~ DAO : 데이터베이스 작업
public class UserDAO {

	private Connection con; // 지역변수 설정
	private PreparedStatement pstmt; // 지역변수 설정
	private ResultSet rs; // 지역변수 설정

	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "javadb";
		String password = "12345";

		try {
			Connection con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close(Connection con, PreparedStatement pstmt) {
		try {
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean insert(String name, String birthYear, String addr, String mobile) {

		boolean flag = false;

		con = getConnection();
		String sql = "INSERT INTO USERTBL (NO, USERNAME, BIRTHYEAR,ADDR,MOBILE) ";
		sql += "VALUES(user_seq.NEXTVAL, ?,?,?,?)";

// executeUpdate() : insert, update, delete 와 같은 DML 구문 실행
		try {
			pstmt = con.prepareStatement(sql); // 실행코드
			// ? 해결
			pstmt.setString(1, name);
			pstmt.setInt(2, Integer.parseInt(birthYear));
			pstmt.setString(3, addr);
			pstmt.setString(4, mobile);
			int count = pstmt.executeUpdate();

			if (count > 0)
				flag = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;
	}

	public List<UserDTO> getList() {
		List<UserDTO> list = new ArrayList<>();

		try {

			con = getConnection();
			// 3. SQL 쿼리문 실행 -1) 전체 조회
			String spl = "select * from usertbl";
			pstmt = con.prepareStatement(spl);

			rs = pstmt.executeQuery(); // 쿼리문 실행한 후 결과 전송 ResultSet 결과를 담는 특별한 객체라고 생각
			while (rs.next()) {
				int no = rs.getInt("no");
				String username = rs.getString("username");
				int birthYear = rs.getInt("birthYear");
				String addr = rs.getString("addr");
				String mobile = rs.getString("mobile");

				list.add(new UserDTO(no, username, birthYear, addr, mobile));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}

	public UserDTO getRow(int no) {
		UserDTO dto = null; // 널 지정
		try {
			con = getConnection(); // 드라이버 로드

			String sql = "select * from usertbl where no=?"; // sql 실행문
			pstmt = con.prepareStatement(sql); // sql 실행문 pstmt로 옮김
			pstmt.setInt(1, no); // ?값 세팅

			rs = pstmt.executeQuery(); // sql문 실행해서 rs에 테이블 변수에 담아라

			if (rs.next()) { // next에 가져올게 있으면 true
				String name = rs.getString("username"); // 테이블 username 변수명 name 담기
				int birthYear = rs.getInt("birthYear"); // 테이블 birthYear 변수명 birthYear 담기
				String addr = rs.getString("addr"); // 테이블 addr 변수명 addr 담기
				String mobile = rs.getString("mobile"); // 테이블 mobile 변수명 mobile 담기

				
				dto = new UserDTO(no, name, birthYear, addr, mobile); // 객체 생성
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs); // 사용하면 닫는다.
		}
		return dto; // getRow 에 리턴
	}
	// 수정

	public boolean update(int no, String addr, String mobile) {
		boolean flag = false;
		try {
			con = getConnection();

			String sql = "";
			if (addr != "" && mobile != "") {
				sql = "update usertbl set addr=?,mobile=? where no=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, addr);
				pstmt.setString(2, mobile);
				pstmt.setInt(3, no);
			} else {
				if (addr != "") {
					sql = "update usertbl set addr=? where no=?";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, addr);
					pstmt.setInt(2, no);
				} else {
					sql = "update usertbl set mobile=? where no=?";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, mobile);
					pstmt.setInt(2, no);
				}
			}
			
			int count = pstmt.executeUpdate();

			if (count > 0)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;
	}

	public boolean remove(int no) {
		boolean flag = false;
		try {
			con = getConnection();
			
			String sql ="delete from usertbl where no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			int count = pstmt.executeUpdate();
			if(count>0) flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;
	}
}
