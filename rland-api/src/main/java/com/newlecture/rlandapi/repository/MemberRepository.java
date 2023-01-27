package com.newlecture.rlandapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.newlecture.rlandapi.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Integer>{
  @Query("select m from member m where m.username = :username")
  Member findByUsername(@Param("username") String username);
}
