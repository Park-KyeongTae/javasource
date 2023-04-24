package book.persostence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import book.domain.BookDTO;

public class BookDAO {

	// 드라이버 로드
	private Connection con; // import설정 및 변수
	private PreparedStatement pstmt; // import설정 및 변수
	private ResultSet rs; // import설정 및 변수

	static { // 스태틱 블록
		try {
			Class.forName("oracle.jdbc.OracleDriver"); // 드라이버 로드
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	// DB서버 연결

	public Connection getConnection() { // getConnection 메소드
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 주소
		String user = "javadb"; // 아이디
		String password = "12345"; // 비밀번호
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			// DML 실행 시 트랜잭션 관리를 직접하겠음 (rollback, commit)
			con.setAutoCommit(false);// 원래는 true
			return con; // con 값을 getConnection에게 값 돌려주겠음
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null; 
	}

	// 자원해제
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) { // select 전용
		try {
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close(Connection con, PreparedStatement pstmt) { // update,delete 전용
		try {
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void commit(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 도서목록 조회
	public List<BookDTO> getList(){
		List<BookDTO> list = new ArrayList<>();
		
		try {
			con= getConnection();
			String sql = "select code,title,writer,price from booktbl";
					pstmt = con.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
			
			while (rs.next()) {
//				int code = rs.getInt("code");
//				String title = rs.getString("title");
//				String writer = rs.getString("writer");
//				int price = rs.getInt("price");
//				
//				list.add(new BookDTO(code,title,writer,price));
				 BookDTO dto = new BookDTO();
				    dto.setCode(rs.getInt("code"));
				    dto.setTitle(rs.getString("title"));
				    dto.setWriter(rs.getString("writer"));
				    dto.setPrice(rs.getInt("price"));
				    list.add(dto);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	
	// 도서 상세 조회
	// select * from book where code=?
	
	  public BookDTO getRow(int code) {
	    BookDTO dto = null;
		  try {
			  
			  con = getConnection();
			  String sql = "select * from booktbl where code=?";
			  pstmt = con.prepareStatement(sql);
			  pstmt.setInt(1, code);
			  
			  rs = pstmt.executeQuery();
			  
			  if (rs.next()) {
				code = rs.getInt("code");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
			    int price = rs.getInt("price");
			    String description = rs.getString("description");
			    
			    dto = new BookDTO(code, title, writer, price, description);
			   
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		  return dto;
	 }
	 
}
