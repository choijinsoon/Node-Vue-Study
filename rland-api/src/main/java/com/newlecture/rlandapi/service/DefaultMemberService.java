package com.newlecture.rlandapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.rlandapi.entity.Member;
import com.newlecture.rlandapi.repository.MemberRepository;

@Service
public class DefaultMemberService implements MemberService{

  @Autowired
  private MemberRepository repository;

  @Override
  public Member get(String username) {
    Member member = repository.findByUsername(username);
    return member;
  }

  @Override
  public List<Member> getList() {
    // TODO Auto-generated method stub
    return null;
  }
  
}
