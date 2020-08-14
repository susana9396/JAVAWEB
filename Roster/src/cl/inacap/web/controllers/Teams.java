package cl.inacap.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.inacap.web.models.Roster;
import cl.inacap.web.models.Team;

/**
 * Servlet implementation class Teams
 */
@WebServlet({ "/Teams", "/teams" })
public class Teams extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id= request.getParameter("id");
		if (id==null) {
			RequestDispatcher view= request.getRequestDispatcher("/WEB-INF/views/newTeam.jsp");
			view.forward(request, response);
		}else {
			HttpSession session=request.getSession();
			Roster roster=(Roster) session.getAttribute("roster");
			if(roster==null) {
				roster =new Roster();    
				session.setAttribute("roster", roster);
			}
			int idTeam=Integer.parseInt(id);
			Team team=roster.getTeam(idTeam);
			request.setAttribute("team", team);
			RequestDispatcher view= request.getRequestDispatcher("/WEB-INF/views/teamInfo.jsp");
			view.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("teamName");
		HttpSession session=request.getSession();
		Roster roster=(Roster) session.getAttribute("roster");
		if(roster==null) {
			roster =new Roster();    
			
		}
		roster.addTeam(name);
		session.setAttribute("roster", roster);
		
		response.sendRedirect("/Roster/home");
		
	}

}
