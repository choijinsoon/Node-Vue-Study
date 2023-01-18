package com.newlecture.rlandapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newlecture.rlandapi.entity.NutritionFacts;

public interface NutritionFactsRepository extends JpaRepository<NutritionFacts, Integer>{
  
}
