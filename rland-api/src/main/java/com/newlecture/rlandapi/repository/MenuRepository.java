package com.newlecture.rlandapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newlecture.rlandapi.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer>{
  
}
