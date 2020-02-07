package atest;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Auser")
public class AuserDAO extends HttpServlet { 
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("utf-8");
	response.setContentType("text/plain;charset=utf-8");
	
	String id = request.getParameter("id"); 
	String pw = request.getParameter("pw"); 
	System.out.println("id: "+id);
	System.out.println("pw: "+pw);

	if(id != null || pw != null){
	Ausers atest1 = new Ausers(); 
	atest1.setId(id); 
	atest1.setPw(pw); 
	AuserDAO atest = new AuserDAO(); 
	int atest2=atest.login(id, pw); 
	System.out.println("atest2: "+atest2);

	if(atest2 == 1){
		
		//response는 응답을 보내주는거고  마인타입이 여러개가 있거 text는 문자형태고 plain이 기본적인 문자열
		response.getWriter().print("login성공");
		}else if(atest2 == 0){
			
		response.getWriter().print("비밀번호가 맞지않습니다");
		}else if(atest2 == -1){
			
		response.getWriter().print("아이디가 맞지않습니다");
		}else if(atest2 == -2) {
			
		response.getWriter().print("디비오류");
		}
	} 

}
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;


	

	public AuserDAO() {
		try {
			System.out.println("AuserDAO()호출");
			String dbURL = "jdbc:mysql://localhost:3306/atest";
			System.out.println("AuserDAO()1");
			String dbID = "root";
			String dbPassword = "1234";
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("AuserDAO()2");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			System.out.println("AuserDAO()3");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

 
	public int login(String id, String pw) {
		
		try {
			System.out.println("login호출");
			pstmt = conn.prepareStatement("SELECT id FROM atest WHERE pw= ?");
			System.out.println("1");
			pstmt.setString(1,id);
			rs = pstmt.executeQuery();
			System.out.println("2");
			if (rs.next()) {
				System.out.println("3");
				System.out.println("rs.next존재");
				if (rs.getString(1).equals(pw))
					
					return 1;// 로그인성공
				else
					return 0;// 비밀번호 불일치
			}
			return -1;// 아이디가 없음
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -2;// 데이터베이스 오류
		}
	}
