package com.example.soccer_league_jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.soccer_league_jpa.model.League;
import com.example.soccer_league_jpa.repository.LeagueRepository;

@Service
public class LeagueServiceImpl implements LeagueService {

	private LeagueRepository leagueRepository;
	
	public LeagueServiceImpl(LeagueRepository leagueRepository) {
		super();
		this.leagueRepository = leagueRepository;
	}

	@Override
	public List<League> findAll() {
		// TODO Auto-generated method stub
		return (List<League>) leagueRepository.findAll();
	}

	@Override
	public League findById(long theId) {
Optional<League> result = leagueRepository.findById(theId);
		
		League theLeague = null;
		
		if (result.isPresent()) {
			theLeague = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find id - " + theId);
		}
		
		return theLeague;
	}

	@Override
	public void save(League theLeague) {
		// TODO Auto-generated method stub
		leagueRepository.save(theLeague);
	}

	@Override
	public void deleteById(long theId) {
		// TODO Auto-generated method stub
		leagueRepository.deleteById(theId);
	}

	
	

}
