package com.example.springh2inmemoryjpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springh2inmemoryjpa.model.Author;



@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}