package com.slokam.TeamsPalyers.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.TeamsPalyers.Dao.TeamDao;
import com.slokam.TeamsPalyers.Entity.Team;
import com.slokam.TeamsPalyers.Service.TeamService;
@Service
public class TeamServiceImpl implements TeamService {
	
	@Autowired
	private TeamDao teamDao;

	@Override
	public List<Team> findAllTeams() {
		// TODO Auto-generated method stub
		return teamDao.findAll();
	}

	@Override
	public Team saveTeam(Team team) {
		// TODO Auto-generated method stub
		return teamDao.save(team);
	}

	@Override
	public Team updateTeam(Team team) {
		// TODO Auto-generated method stub
		return teamDao.save(team);
	}

	@Override
	public Team findById(Integer teamId) {
		// TODO Auto-generated method stub
		return teamDao.findById(teamId).get();
	}

	@Override
	public void deleteById(Integer teamId) {
		// TODO Auto-generated method stub
		teamDao.deleteById(teamId);
		
	}

}
