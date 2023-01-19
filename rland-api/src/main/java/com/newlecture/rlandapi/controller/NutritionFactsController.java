package com.newlecture.rlandapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newlecture.rlandapi.entity.NutritionFacts;
import com.newlecture.rlandapi.repository.NutritionFactsRepository;

@RestController
@RequestMapping("nutritions")
public class NutritionFactsController {
  
  @Autowired
  private NutritionFactsRepository repository;

  @GetMapping()
  public List<NutritionFacts> getList() {
    List<NutritionFacts> list = repository.findAll();
    return list;
  }
  
  @GetMapping("{id}")
  public NutritionFacts get(@PathVariable int id){
    NutritionFacts nutrition = null;
    Optional<NutritionFacts> opt = repository.findById(id);

    if(opt.isPresent())
      nutrition = opt.get();


    return nutrition;
  }
}
