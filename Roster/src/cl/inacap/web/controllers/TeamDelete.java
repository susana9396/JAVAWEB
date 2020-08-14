package cl.inacap.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.inacap.web.models.Roster;

/**
 * Servlet implementation class TeamDelete
 */
@WebServlet({ "/TeamDelete", "/teamDelete" })
public class TeamDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String teamId=request.getParameter("teamId");
		HttpSession session=request.getSession();
		Roster roster=(Roster) session.getAttribute("roster");
		if(roster==null) {
			roster =new Roster();    	
		}
		
		int id=Integer.parseInt(teamId);
		roster.deleteTeam(id);
		session.setAttribute("roster", roster);
		response.sendRedirect(request.getContextPath() + "/Home");
		
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
