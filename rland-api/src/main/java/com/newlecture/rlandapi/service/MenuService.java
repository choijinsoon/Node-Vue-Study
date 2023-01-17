package com.newlecture.rlandapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.newlecture.rlandapi.entity.Menu;

public interface MenuService {
  Menu get(int id);
  
  List<Menu> getList(int page, int size);

  Menu create(Menu menu);

  Menu update(Menu menu);

  void delete(int id);
}
