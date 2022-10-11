package org.alvas.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value="/home")
public class Home extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		HttpSession hs=req.getSession();
		PrintWriter  pw=resp.getWriter();
		
		if(hs.getAttribute("myname")!=null)
		{
			RequestDispatcher rs=req.getRequestDispatcher("home.jsp");
			rs.forward(req, resp);
			
		}
		else
		{
			pw.println("invalid username");
			RequestDispatcher rs=req.getRequestDispatcher("login.jsp");
			rs.include(req, resp);
			
			
		}
	}

}
