package com.newlecture.rlandapi.entity;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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

  @OneToOne
  @JoinColumn(name = "id", referencedColumnName = "menuId")
  private NutritionFacts nutritionFacts;
  
}
