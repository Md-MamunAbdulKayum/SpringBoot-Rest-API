package com.notearena.springbootrestapi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.notearena.springbootrestapi.model.Team;

@Service
public class TeamServiceImpl implements TeamService{

	private List<Team> teams = new ArrayList<>(Arrays.asList(
			new Team("Ind","Team India","India Cricket Team"),
			new Team("Pak","Team Pakistan","Pakistan Cricket Team"),
			new Team("Ban","Team Bangladesh","Bangladesh Cricket Team")
			));
	
	@Override
	public List<Team> getAllTeam() {
		// TODO Auto-generated method stub
		return teams;
	}

	@Override
	public Team getTeamById(String id) {
		// TODO Auto-generated method stub
		return teams.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	@Override
	public void addTeam(Team team) {
		teams.add(team);
		
	}

	@Override
	public void updateTeam(Team team, String id) {
     for (int i = 0; i < teams.size(); i++) {
		if(teams.get(i).getId().equals(id)) {
			teams.set(i, team);
			return;
		}
	}	
	}

	@Override
	public void deleteTeam(String id) {
	     for (int i = 0; i < teams.size(); i++) {
	 		if(teams.get(i).getId().equals(id)) {
	 			teams.remove(i);
	 			return;
	 		}
	 	}
				
	}

}
