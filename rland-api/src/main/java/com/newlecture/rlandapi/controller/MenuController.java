package com.newlecture.rlandapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.newlecture.rlandapi.entity.Menu;

@RestController
@RequestMapping("menus")
public class MenuController  {

  @GetMapping
  public String getList(@RequestParam(name="p", defaultValue = "1") int page, @RequestParam(name="s", defaultValue = "15") int size){
    return String.format("get Menu List: page=%d, size=%d", page, size);
  }
  
  
  @GetMapping(path = "{id}", produces = {
    MediaType.APPLICATION_JSON_VALUE,
    MediaType.APPLICATION_XML_VALUE
  })
  public ResponseEntity<Menu> get(@PathVariable int id){
    Menu menu = Menu.builder().name("newlecture").price(1000).build();
    System.out.println(menu.toString());

    return new ResponseEntity<Menu>(HttpStatus.NOT_FOUND);
  }

  @PostMapping(consumes = {
    MediaType.APPLICATION_JSON_VALUE,
    MediaType.APPLICATION_XML_VALUE
  })
  public Menu create(@RequestBody Menu menu){


    return menu;
  }

  @PutMapping
  public String update(Menu menu){
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
