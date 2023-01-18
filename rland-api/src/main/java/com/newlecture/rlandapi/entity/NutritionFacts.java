package com.newlecture.rlandapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
  
  @Column(name = "saturated_fat")
  private int saturatedFat;
  private int menuId;
}
