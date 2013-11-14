package edu.nvcc.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Authentication
 */
@WebServlet("/Authentication")
public class Authentication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Authentication() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String correctUsername = "Tanes";
		String correctPW = "1234";
		
		String uname = request.getParameter("username");
		String pw = request.getParameter("password");
		
		if (uname.equals(correctUsername) && (pw.equals(correctPW))) {
			PrintWriter out = response.getWriter();
			out.println("<html>");
		    out.println("<head>");
		    out.println("<title>Welcome</title>");
		    out.println("</head>");
		    out.println("<body bgcolor=\"Red\">");
		    out.println("Weclome " + uname +"<br/>");
		    out.println("</body>");
		    out.println("</html>");
		    out.close();

			
		} else {
			response.sendRedirect("index.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
