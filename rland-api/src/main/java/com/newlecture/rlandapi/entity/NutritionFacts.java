package com.newlecture.rlandapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "NUTRITION_FACTS")
public class NutritionFacts {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private int calories;
  private int saturatedFat;
  private int menuId;

  // @OneToOne
  // @JoinColumn(name = "id")
  // private Menu menu;
}
