package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>Världen</h1>"
				+ "_____________________________________________________________________"
				+ "<h1>Danmark</h1>"
				+ "<br>"
				+ "<h3>Köpenhamn</h3> <br>"
				+ "Odense<br>"
				+ "Aalborg<br>"
				+ "_____________________________________________________________________"
				+ "<h1>Norge</h1>"
				+ "<h3>Oslo</h3> <br>"
				+ "Trondheim <br>"
				+ "Bergen <br>"
				+ "_____________________________________________________________________"
				+ "<h1>Sverige</h1>"
				+ "<br>"
				+ "<h3>Stockholm</h3>"
				+ "<br>"
				+ "Kalmar <br>"
				+ "Falun <br>"
				+ "Alvest <br>"			
				+ "</body></html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
