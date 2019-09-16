package com.example.springh2receipe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springh2receipe.model.Notes;
import com.example.springh2receipe.model.Receipe;
@Repository
public interface NotesRepository extends CrudRepository<Notes,Long>{

}
