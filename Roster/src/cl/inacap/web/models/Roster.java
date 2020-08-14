package cl.inacap.web.models;

import java.util.ArrayList;

public class Roster {

		private ArrayList<Team> teams=new ArrayList<Team>();
		
		public void addTeam(String name) {
			teams.add(new Team(name));
		}
		
		public Team getTeam(int id) {
			for(int i=0; i<teams.size(); i++) {
				Team t =teams.get(i);
				if(t.getId()==id) {
					return t;
				}
			}
			return null;
		}
		
		public void deleteTeam(int id) {
			int pos=-1;
			for (int i=0; i <teams.size(); i++) {
				Team p = teams.get(i);
				if (p.getId() ==id) {
					pos=i;
					break;
				}
			}
			if(pos>=0) {
				teams.remove(pos);
			}
			
		}
		
		//Getter y setter
		public ArrayList<Team> getTeams() {
			return teams;
		}

		public void setTeams(ArrayList<Team> teams) {
			this.teams = teams;
		}
		
}
