package com.newlecture.rlandapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.newlecture.rlandapi.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Integer>{
  @Query(value = "select m from Member m where m.username like :username")
  Member findByUsername(@Param("username") String username);
}
