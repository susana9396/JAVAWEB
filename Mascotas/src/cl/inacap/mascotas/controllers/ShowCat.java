package cl.inacap.mascotas.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.inacap.mascotas.models.Cat;

/**
 * Servlet implementation class Cat
 */
@WebServlet("/ShowCat")
public class ShowCat extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ShowCat() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String breed = request.getParameter("breed");
		double weight = Double.parseDouble(request.getParameter("weight"));
		
		Cat cat = new Cat(name,breed,weight);
		
		request.setAttribute("cat", cat); 
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/cat.jsp");
        view.forward(request, response);	
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
