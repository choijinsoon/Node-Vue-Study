package com.newlecture.rlandapi.repository;

import java.util.List;

import com.newlecture.rlandapi.entity.Menu;

public interface MenuRepository{
List<Menu> getList(int offset, int size);
Menu get(int id);
Menu create(Menu menu);
}
