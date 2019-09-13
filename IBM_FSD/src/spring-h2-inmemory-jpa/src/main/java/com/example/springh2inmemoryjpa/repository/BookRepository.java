package com.example.springh2inmemoryjpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springh2inmemoryjpa.model.Book;
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}