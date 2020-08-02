//Marcela, Antonio, Jorge G, Susana 
package cl.inacap.simpleproject;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String name = request.getParameter("first");
		String apellido = request.getParameter("last");
		String lenguaje = request.getParameter("favlenguage");
		String ciudad = request.getParameter("city");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		if (name == null || name.equals("")) {
			name = "Unknown";	
		}
		if (apellido == null || apellido.equals("")) {
			apellido = "Unknown";	
		}
		if (lenguaje == null || lenguaje.equals("")) {
			lenguaje = "Unknown";	
		}
		if (ciudad == null || ciudad.equals("")) {
			ciudad = "Unknown";	
		}
			
		out.write("<h1>Welcome, "+name+" "+apellido+"</h1>");
		out.write("<h2>Tu lenguaje favorito es: "+lenguaje+"</h2>");
		out.write("<h2>Tu ciudad es: "+ciudad+"</h2>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
