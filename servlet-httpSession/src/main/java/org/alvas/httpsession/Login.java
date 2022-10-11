package org.alvas.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value="/Login")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		HttpSession httpsession=req.getSession();
		PrintWriter pw=resp.getWriter();
		
		String username=req.getParameter("username");
		String pswd=req.getParameter("password");
		
		if(username.equals("4al19cs014") && pswd.equals("Alvas@123"))
		{
			httpsession.setAttribute("myname", username);
			
			RequestDispatcher rs=req.getRequestDispatcher("/home");
			rs.forward(req, resp);
		
	}
		else
		{
			pw.println("invalid username and password");
			RequestDispatcher rs=req.getRequestDispatcher("login.jsp");
			rs.include(req, resp);
			
			
		}

}
}
