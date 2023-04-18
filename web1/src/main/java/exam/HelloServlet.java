package exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// HttpServletRequest request 객체가 있어야 사용자가 요청한 작업 처리가능
// doGet action의 method가 get 
// doPost action의 method가 post 
/**
 * jsp == servlet : 할 수 있는 일이 같음
 * 				    사용자 요청 처리
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		// 화면에 보여주기
		response.setContentType("text/html;charset=utf-8");;
		PrintWriter out = response.getWriter();
		out.print("<h3> 이름 : "+ name+"</h3>");
		out.print("<h3> 나이 : "+ age+"</h3>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doGet(request, response);
		
	}

}
