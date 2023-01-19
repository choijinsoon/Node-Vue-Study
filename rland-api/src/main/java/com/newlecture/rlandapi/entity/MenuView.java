package com.newlecture.rlandapi.entity;

import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.Immutable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Data
@Immutable
public class MenuView {

  @Id
  private int id;
  private String name;
  private int price;

  // private NutritionFacts nutritionFacts;
  private int calories;
  private int saturatedFat;

  @Transient
  private List<Comment> comments;
}
