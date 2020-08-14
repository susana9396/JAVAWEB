package cl.inacap.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.inacap.web.models.Roster;
import cl.inacap.web.models.Team;

/**
 * Servlet implementation class PlayerDelete
 */
@WebServlet({ "/PlayerDelete", "/playerDelete" })
public class PlayerDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String playerId=request.getParameter("id");
		String teamId=request.getParameter("teamId");
		HttpSession session=request.getSession();
		Roster roster=(Roster) session.getAttribute("roster");
		if(roster==null) {
			roster =new Roster();    	
		}
		int id =Integer.parseInt(teamId);
		Team team=roster.getTeam(id);
		team.deletePlayer(Integer.parseInt(playerId));
		session.setAttribute("roster", roster);
		response.sendRedirect(request.getContextPath() + "/teams?id="+teamId);
			
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
