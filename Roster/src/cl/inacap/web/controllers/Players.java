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
 * Servlet implementation class Players
 */
@WebServlet({ "/Players", "/players" })
public class Players extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String teamId= request.getParameter("id");
		HttpSession session=request.getSession();
		Roster roster=(Roster) session.getAttribute("roster");
		if(roster==null) {
			roster =new Roster();    	
		}
	
		int id =Integer.parseInt(teamId);
		
		Team team=roster.getTeam(id);
		request.setAttribute("team", team);

		RequestDispatcher view= request.getRequestDispatcher("/WEB-INF/views/newPlayer.jsp");
		view.forward(request, response);
	
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		Roster roster=(Roster) session.getAttribute("roster");
		if(roster==null) {
			roster =new Roster();    	
		}
		String teamId= request.getParameter("id");
		int id =Integer.parseInt(teamId);
		Team team=roster.getTeam(id);
		String fName=request.getParameter("fName");
		String lName=request.getParameter("lName");
		String age=request.getParameter("age");
		
		team.addPlayers(fName, lName, Integer.parseInt(age));
		
		session.setAttribute("roster", roster);
		response.sendRedirect("/Roster/teams?id="+id);
	}

}
