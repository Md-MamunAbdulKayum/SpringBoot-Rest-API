package com.notearena.springbootrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.notearena.springbootrestapi.model.Team;
import com.notearena.springbootrestapi.service.TeamService;

@RestController
public class TeamController {
	
    @Autowired
	TeamService teamService;
	
	@RequestMapping("/teams")
	public List<Team> getAllTeams() {
		
		return teamService.getAllTeam();
		
	}
	
	@RequestMapping("/teams/{id}")
	public Team getTeam(@PathVariable String id) {
		
		return teamService.getTeamById(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/teams")
	public void addTeam(@RequestBody Team team) {
		teamService.addTeam(team);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/teams/{id}")
	public void updateTeam(@RequestBody Team team, @PathVariable String id) {
		teamService.updateTeam(team, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/teams/{id}")
	public void deleteTeam(@PathVariable String id) {
		teamService.deleteTeam(id);
	}
	}
