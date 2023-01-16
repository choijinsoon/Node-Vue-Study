package com.newlecture.rlandapi.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("menus")
public class MenuController {

  @GetMapping
  public String getList(@RequestParam(name="p", defaultValue = "1") int page, @RequestParam(name="s", defaultValue = "15") int size){
    return String.format("get Menu List: page=%d, size=%d", page, size);
  }
  
  
  @GetMapping("{id}")
  public String get(@PathVariable("id") int id){
    return String.format("get Menu: id=%d", id);
  }

  @PostMapping
  public String add(){
    return "add Menu";
  }

  @PutMapping
  public String update(){
    return "update Menu";
  }

  @DeleteMapping
  public String delete(){
    return "delete Menu";
  }

  @GetMapping("hello")
  public String hello(){
    return "Hello";
  }
}
