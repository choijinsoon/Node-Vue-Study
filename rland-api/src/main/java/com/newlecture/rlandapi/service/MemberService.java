package com.newlecture.rlandapi.service;

import java.util.List;

import com.newlecture.rlandapi.entity.Member;

public interface MemberService {
  Member get(String username);
  List<Member> getList();
}
