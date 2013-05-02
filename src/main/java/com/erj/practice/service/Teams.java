package com.erj.practice.service;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class Teams {
	private TeamsUtility utils;
	
	public Teams(){
		utils = new TeamsUtility();
		utils._makeTestTeams();
	}
	
	@WebMethod
	public Team getTeam(String name){
		return utils.fetchByName(name);
	}
	
	@WebMethod
	public List<Team> getTeams(){
		return utils.fetchAll();
	}
}
