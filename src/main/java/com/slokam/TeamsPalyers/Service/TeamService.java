package com.slokam.TeamsPalyers.Service;

import java.util.List;
import java.util.Optional;

import com.slokam.TeamsPalyers.Entity.Team;

public interface TeamService  {
	
	
	public List<Team> findAllTeams();
	
	public Team saveTeam(Team team);
	
	public Team updateTeam(Team team);
	
	public Optional<Team> findById(Integer teamId);
	
	public void deleteById(Integer teamId);

}
