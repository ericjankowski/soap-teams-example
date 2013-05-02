package com.erj.practice.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TeamsUtility {

	private Map<String, Team> teamMap;
	
	public TeamsUtility(){
		teamMap = new HashMap<String, Team>();
	}
	
	public void _makeTestTeams() {
		List<Team> teams = new ArrayList<Team>();
		
		List<Player> mb = new ArrayList<Player>();
		mb.add(new Player("Leonard Marx", "Chico"));
		mb.add(new Player("Julius Marx", "Groucho"));
		mb.add(new Player("Adolph Marx", "Harpo"));
		teams.add(new Team("Marx Brothers", mb));
		
		List<Player> gb = new ArrayList<Player>();
		gb.add(new Player("Dan Akroyd", "Ray"));
		gb.add(new Player("Bill Murray", "Venkman"));
		gb.add(new Player("Harold Ramis", "Egon"));
		gb.add(new Player("Ernie Hudson", "Winston"));
		teams.add(new Team("Ghostbusters", gb));
		for(Team team : teams){
			teamMap.put(team.getName(), team);
		}
		
		
	}

	public Team fetchByName(String name) {
		return teamMap.get(name);
	}

	public List<Team> fetchAll() {
		List<Team> list = new ArrayList<Team>();
		Set<String> keys = teamMap.keySet();
		for (String key : keys){
			list.add(teamMap.get(key));
		}
		return list;
	}

}
