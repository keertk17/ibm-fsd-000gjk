package com.example.springh2receipe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springh2receipe.model.Receipe;
@Repository
public interface ReceipeRepository extends CrudRepository<Receipe,Long>{

}
