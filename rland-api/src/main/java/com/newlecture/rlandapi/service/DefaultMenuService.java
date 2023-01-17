package com.newlecture.rlandapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.rlandapi.entity.Menu;
import com.newlecture.rlandapi.repository.MenuRepository;

@Service
public class DefaultMenuService implements MenuService {

  @Autowired
  private MenuRepository repository;

  @Override
  public Menu get(int id) {
    Menu menu = repository.getReferenceById(id);
    return menu;
  }

  @Override
  public List<Menu> getList(int page, int size) {
    List<Menu> list = repository.findAll();
    return list;
  }
  
}
