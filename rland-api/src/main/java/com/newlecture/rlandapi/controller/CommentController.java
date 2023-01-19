package com.newlecture.rlandapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newlecture.rlandapi.entity.Comment;
import com.newlecture.rlandapi.repository.CommnetRepository;

@RestController
@RequestMapping("comments")
public class CommentController {
  
  @Autowired
  private CommnetRepository repository;

  @GetMapping()
  public List<Comment> getList() {
    List<Comment> list = repository.findAll();
    return list;
  }
  
  @GetMapping("{id}")
  public Comment get(@PathVariable int id){
    Comment nutrition = null;
    Optional<Comment> opt = repository.findById(id);

    if(opt.isPresent())
      nutrition = opt.get();


    return nutrition;
  }
}
