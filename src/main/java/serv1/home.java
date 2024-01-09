package serv1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class home
 */
@WebServlet("/Login")
public class home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String s= request.getParameter("uname");
		String v=request.getParameter("psw");
		if(s.equals("rishabhkandwal2820@gmail.com") && v.equals("1234")) 
		{
			RequestDispatcher c= request.getRequestDispatcher("/Welcome.html");
			c.forward(request, response);
		}
		else 
		{
			out.print("INVALID USERNAME OR PASSWORD");
			RequestDispatcher c= request.getRequestDispatcher("/Index.html");
			c.forward(request, response);
		}
		//out.println(s);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
