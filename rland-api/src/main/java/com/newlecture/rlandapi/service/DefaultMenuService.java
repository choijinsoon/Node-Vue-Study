package com.newlecture.rlandapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.newlecture.rlandapi.entity.Comment;
import com.newlecture.rlandapi.entity.Menu;
import com.newlecture.rlandapi.entity.MenuView;
import com.newlecture.rlandapi.repository.CommnetRepository;
import com.newlecture.rlandapi.repository.MenuRepository;
import com.newlecture.rlandapi.repository.MenuViewRepository;

@Service
public class DefaultMenuService implements MenuService {

  @Autowired
  private MenuRepository repository;

  @Autowired
  private MenuViewRepository viewRepository;
  
  @Autowired
  private CommnetRepository commentRepository;

  @Override
  public Menu get(int id) {
    Menu menu = null;
    Optional<Menu> opt = repository.findById(id);
    if(opt.isPresent())
      menu = opt.get();

    return menu;
  }

  @Override
  public List<Menu> getList(int page, int size) {
    List<Menu> list = repository.findAll();
    return list;
  }

  @Override
  public Menu create(Menu menu) {
    repository.save(menu);
    return menu;
  }

  @Override
  public Menu update(Menu menu) {
    menu.getName();
    menu.getPrice();

    Menu oldOne = get(menu.getId());

    if(menu.getName() != null)
      oldOne.setName(menu.getName());

    if(menu.getPrice() != 0)
      oldOne.setPrice(menu.getPrice());
    
    Menu newOne = repository.save(oldOne);

    return newOne;
  }

  @Override
  public void delete(int id) {
    repository.deleteById(id);
    
  }

  @Override
  public List<MenuView> getViewList(String query, int page, int size) {
    // List<MenuView> list = viewRepository.findAll().stream().filter(menuview->menuview.getName().contains(query)).toList();

    List<MenuView> list = viewRepository.getViewList("%"+query+"%", PageRequest.of(page-1, size));

    for(MenuView view : list){
      List<Comment> comments = commentRepository.findAll().stream().filter(comment->comment.getMenuId() == view.getId()).toList();

      view.setComments(comments);
    }
    return list;
  }
  
}
