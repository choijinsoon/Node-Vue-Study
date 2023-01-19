package com.newlecture.rlandapi.entity;


import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Menu {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @NotNull(message = "name 속성은 Null일 수 없습니다.")
  private String name;
  private int price;

  @JsonManagedReference
  @OneToOne(mappedBy = "menu") // 외래 객체 찾기
  private NutritionFacts nutritionFacts;
  
  // @OneToMany
  // @JoinColumn(name = "id", referencedColumnName = "menu_id")
  // private List<Comment> comments;

}
