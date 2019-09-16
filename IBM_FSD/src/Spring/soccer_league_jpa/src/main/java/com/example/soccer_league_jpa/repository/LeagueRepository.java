package com.example.soccer_league_jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.soccer_league_jpa.model.League;

@Repository
public interface LeagueRepository extends CrudRepository<League, Long> {

}
