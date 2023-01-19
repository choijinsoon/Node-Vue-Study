package com.newlecture.rlandapi.service;

import java.util.List;

import com.newlecture.rlandapi.entity.Menu;
import com.newlecture.rlandapi.entity.MenuView;

public interface MenuService {
  List<MenuView> getViewList(int page, int size);
  
  Menu get(int id);
  
  List<Menu> getList(int page, int size);

  Menu create(Menu menu);

  Menu update(Menu menu);

  void delete(int id);
}
