package com.example.soccer_league_jpa.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.soccer_league_jpa.model.League;
import com.example.soccer_league_jpa.repository.LeagueRepository;

@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent>{
	
	private LeagueRepository leagueRepository;
	
	public void BootStrap() {
		
	}
	
	public Bootstrap(LeagueRepository leagueRepository) {
		super();
		this.leagueRepository = leagueRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		init();
	}

	private void init() {
	 League league=new League("Cricket","Summer",2019);	
	 leagueRepository.save(league);
	}

}
