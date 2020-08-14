package cl.inacap.web.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.inacap.web.models.Aleatoria;

/**
 * Servlet implementation class Home
 */
@WebServlet({ "/Random", "/random" })
public class Random extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Integer count = (Integer)session.getAttribute("count");
		
		if(count == null) {
			count = 1;
		
		}else {
			count++;
			
		}
		session.setAttribute("count", count);
		String numAleatorio = Aleatoria.aleatorio();
        request.setAttribute("alphanum", numAleatorio);
        
        Date hoy= new Date();
        request.setAttribute("hoy", hoy);
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/index.jsp");
        view.forward(request, response);
	}

	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
