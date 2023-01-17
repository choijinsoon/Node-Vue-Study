package com.newlecture.rlandapi.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.newlecture.rlandapi.entity.Menu;

import jakarta.validation.Valid;

@RestController
@RequestMapping("menus")
public class MenuController  {

  // @ExceptionHandler(value = {Exception.class})
  // public ResponseEntity<Object> handlerAnyException(Exception ex, WebRequest request){
  //   return new ResponseEntity<>(ex, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
  // }

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
  public Menu create(@Valid @RequestBody Menu menu){

    return menu;
  }

  @PutMapping
  public Menu update(@RequestBody Menu menu){

    Menu m = null;
    m.getId();
    return menu;
  }

  @DeleteMapping("{id}")
  public ResponseEntity<Void> delete(@PathVariable int id){

    // 삭제 (응답코드 설정 가능)
    return ResponseEntity.noContent().build();
  }
}

