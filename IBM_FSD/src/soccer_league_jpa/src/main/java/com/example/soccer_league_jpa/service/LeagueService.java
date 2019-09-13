package com.example.soccer_league_jpa.service;

import java.util.List;

import com.example.soccer_league_jpa.model.League;

public interface LeagueService {
	
public List<League> findAll();
	
	public League findById(long theId);
	
	public void save(League theLeague);
	
	public void deleteById(long theId);
	
}
