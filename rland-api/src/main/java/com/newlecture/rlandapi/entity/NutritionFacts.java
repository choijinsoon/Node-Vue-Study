package com.newlecture.rlandapi.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

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

  @JsonBackReference
  @OneToOne
  @JoinColumn(name = "menu_id")
  private Menu menu;
}
