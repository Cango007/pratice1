package com.slokam.TeamsPalyers.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slokam.TeamsPalyers.Entity.Team;

public interface TeamDao extends JpaRepository<Team,Integer>{

}
