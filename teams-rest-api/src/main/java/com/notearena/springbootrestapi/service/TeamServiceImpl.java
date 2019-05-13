package com.notearena.springbootrestapi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notearena.springbootrestapi.model.Team;
import com.notearena.springbootrestapi.repository.TeamRepository;

@Service
public class TeamServiceImpl implements TeamService{

	@Autowired
	private TeamRepository teamRepository;
	
//	private List<Team> teams = new ArrayList<>(Arrays.asList(
//			new Team("Ind","Team India","India Cricket Team"),
//			new Team("Pak","Team Pakistan","Pakistan Cricket Team"),
//			new Team("Ban","Team Bangladesh","Bangladesh Cricket Team")
//			));
	
	@Override
	public List<Team> getAllTeam() {
		List<Team> teams = new ArrayList<>();
		teamRepository.findAll().forEach(teams::add);
		return teams;
	}

	@Override
	public Team getTeamById(String id) {
		//return teams.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return teamRepository.findById(id).get();
	}

	@Override
	public void addTeam(Team team) {
		teamRepository.save(team);
		
	}

	@Override
	public void updateTeam(Team team, String id) {
		teamRepository.save(team);
	}

	@Override
	public void deleteTeam(String id) {
		teamRepository.deleteById(id);
				
	}

}
