package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class servlet1 extends HttpServlet{


	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = resp.getWriter()){
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet servlet</title>");
			out.println("</head>");
			out.println("<body>");
			String name =req.getParameter("name");
			out.println("<h1>Hello," +name+ "Welcome to my website..</h1>");
			out.println("<h1><a href='servlet2'>Go to servlet 2</a> </h2>");
			//create a cookie
			Cookie c = new Cookie("user_name", name);
			resp.addCookie(c);
			out.println("</body>");
			out.println("</html>");
			
		}
	}
	
}
