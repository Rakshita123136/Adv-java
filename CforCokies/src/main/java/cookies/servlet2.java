package cookies;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class servlet2 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet 2</title>");
            out.println("</head>");
            out.println("<body>");

            // Retrieve cookies
            Cookie[] cookies = request.getCookies();
            
            // Flag to check if the cookie exists
            boolean f = false;
            String name = "";

            if (cookies != null) {
                for (Cookie c : cookies) {
                    if ("user_name".equals(c.getName())) {
                        f = true;
                        name = c.getValue();
                        break;
                    }
                }
            }

            if (f) {
                out.println("<h1>Hello, " + name + " Welcome back to my website...</h1>");
                out.println("<h1>Thank You!</h1>");
            } else {
                out.println("<h1>You are a new user. Please go to the home page and submit your name.</h1>");
            }

            out.println("</body>");
            out.println("</html>");
        }
    }

}
