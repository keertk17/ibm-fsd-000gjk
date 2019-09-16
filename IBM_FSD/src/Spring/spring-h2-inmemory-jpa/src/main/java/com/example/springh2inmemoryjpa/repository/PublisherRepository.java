package com.example.springh2inmemoryjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springh2inmemoryjpa.model.Publisher;


@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}