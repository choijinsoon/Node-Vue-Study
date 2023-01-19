package com.newlecture.rlandapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newlecture.rlandapi.entity.Comment;


public interface CommnetRepository extends JpaRepository<Comment, Integer>{
  
}
