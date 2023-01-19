package com.newlecture.rlandapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.newlecture.rlandapi.entity.MenuView;
import com.newlecture.rlandapi.repository.MenuViewRepository;
import com.newlecture.rlandapi.service.MenuService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("menus")
public class MenuController  {

  @Autowired
  private MenuService service;

  @GetMapping
  public List<MenuView> getList(@RequestParam(name="p", defaultValue = "1") int page, @RequestParam(name="s", defaultValue = "15") int size){
    
    // List<Menu> list = service.getList(page, size);
    List<MenuView> list = service.getViewList(page, size);
    return list;
  }
  
  
  @GetMapping(path = "{id}")
  public Menu get(@PathVariable int id){
    Menu menu = service.get(id);

    return menu;
  }

  @PostMapping()
  public Menu create(@Valid @RequestBody Menu menu){
    // name, price만 전달, id 제외
    service.create(menu);

    // id를 포함한 새로운 menu
    return menu;
  }

  @PutMapping
  public Menu update(@RequestBody Menu menu){
    Menu newOne = service.update(menu);

    return newOne;
  }

  @DeleteMapping("{id}")
  public void delete(@PathVariable int id){
    service.delete(id);
  }
}

