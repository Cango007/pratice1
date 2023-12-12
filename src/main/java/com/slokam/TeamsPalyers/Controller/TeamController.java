package com.slokam.TeamsPalyers.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.TeamsPalyers.Dao.TeamDao;
import com.slokam.TeamsPalyers.Entity.Team;
import com.slokam.TeamsPalyers.Exception.TeamNotFoundException;
import com.slokam.TeamsPalyers.Service.TeamService;

@RestController
@RequestMapping("/team")

public class TeamController {
	
	@Autowired
	private TeamDao teamDao;
	
	@Autowired
	private TeamService teamService;
	@GetMapping("/findAllTeams")
	public ResponseEntity<List<Team>> findAllTeams()
	{
		return new ResponseEntity<List<Team>>(teamService.findAllTeams(),HttpStatus.OK);
	}
	@PostMapping("/saveTeam")
	public ResponseEntity<Team> saveTeam(@RequestBody Team team)
	{
		return new ResponseEntity<Team>(teamService.saveTeam(team),HttpStatus.CREATED);
	}
@GetMapping("/findById/{teamId}")
public Optional<Team> findById(@PathVariable Integer teamId) 
{
	return teamService.findById(teamId).orElseThrow("AAA");
}
@DeleteMapping("deleteById/{teamId}")
public void deleteById(@PathVariable("teamId") Integer teamId) throws TeamNotFoundException
{
	Optional<Team> opt = teamService.findById(teamId);
	if(opt.isEmpty())
	{
		throw new TeamNotFoundException("Id is not there");
	}
	else
	{
		teamService.deleteById(teamId);
	}
	
	
}
}
