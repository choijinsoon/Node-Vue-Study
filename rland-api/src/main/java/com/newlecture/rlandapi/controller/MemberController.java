package com.newlecture.rlandapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newlecture.rlandapi.entity.Member;
import com.newlecture.rlandapi.service.MemberService;

@RestController
@RequestMapping("members")
public class MemberController  {

  @Autowired
  private MemberService service;

  @GetMapping
  public List<Member> getList(){
    return null;
  }

  @GetMapping("{username}")
  public Member get(@PathVariable String username){
    return service.get(username);
  }
}

