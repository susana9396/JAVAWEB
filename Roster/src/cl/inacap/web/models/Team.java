package cl.inacap.web.models;

import java.util.ArrayList;

public class Team {

		private String name;
		private int id;
		private ArrayList<Player> players = new ArrayList<Player>();
		
		public static int countTeam=0;

		public Team(String name) {
			this.name = name;
			countTeam++;
			this.id=countTeam;
		}
		
		public void addPlayers(String firstName, String lastName, int age) {
			players.add(new Player(firstName, lastName, age));
		}
		
		public Player getPlayer(int id) {
			for(int i=0; i <players.size(); i++) {
				Player p =players.get(i);
				if (p.getId()==id) {
					return p;
				}
			}
			return null;
		}
		
		public void deletePlayer(int id) {
			int pos=-1;
			for (int i=0; i <players.size(); i++) {
				Player p = players.get(i);
				if (p.getId() ==id) {
					pos=i;
					break;
				}
			}
			if(pos>=0) {
				players.remove(pos);
			}
			
		}
		
		public int getSize() {
			return players.size();
		}
		
		//Getter y setter
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public ArrayList<Player> getPlayers() {
			return players;
		}

		public void setPlayers(ArrayList<Player> players) {
			this.players = players;
		}
		
		
		
}
