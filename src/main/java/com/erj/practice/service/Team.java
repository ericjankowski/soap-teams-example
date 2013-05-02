package com.erj.practice.service;

import java.util.List;

public class Team {

	private String name;
	private List<Player> players;

	public Team(){}
	
	public Team(String name, List<Player> players) {
		this.setName(name);
		this.setPlayers(players);
	}

	public String getName() {
		return name;
	}
	
	public List<Player> getPlayers(){
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setRosterCount(int n){}
	
	public int getRosterCount(){
		return (players == null) ? 0 : players.size();
	}

}
