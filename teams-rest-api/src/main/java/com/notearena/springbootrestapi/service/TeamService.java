package com.notearena.springbootrestapi.service;

import java.util.List;

import com.notearena.springbootrestapi.model.Team;

public interface TeamService {

	public List<Team> getAllTeam();
	public Team getTeamById(String id);
	public void addTeam(Team team);
	public void updateTeam(Team team, String id);
	public void deleteTeam(String id);
	
}
