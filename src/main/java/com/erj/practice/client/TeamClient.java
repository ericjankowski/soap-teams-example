package com.erj.practice.client;

import java.util.List;

import com.erj.practice.wsimport.generated.Player;
import com.erj.practice.wsimport.generated.Team;
import com.erj.practice.wsimport.generated.Teams;
import com.erj.practice.wsimport.generated.TeamsService;

public class TeamClient {
	public static void main (String [] args){
		TeamsService service = new TeamsService();
		Teams port = service.getTeamsPort();
		List<Team> teams = port.getTeams();
		for(Team team : teams){
			System.out.println("Team: " + team.getName() + " (" + team.getRosterCount() + " Players)");
			for(Player player : team.getPlayers()){
				System.out.println("  " + player.getNickName());
			}
		}
	}
}
