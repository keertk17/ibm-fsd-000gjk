package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Player;
@Repository
public interface PlayerRepo extends JpaRepository<Player, Integer>{

}
