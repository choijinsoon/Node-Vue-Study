package com.newlecture.rlandapi.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
public class Menu {
  private int id;
  private String name;
  private int price;

  // public Menu() {
  // }
  // public Menu(int id, String name, int price) {
  //   this.id = id;
  //   this.name = name;
  //   this.price = price;
  // }
  
  // public Menu(String name, int price) {
  //   this.name = name;
  //   this.price = price;
  // }
  // public int getId() {
  //   return id;
  // }
  // public void setId(int id) {
  //   this.id = id;
  // }
  // public String getName() {
  //   return name;
  // }
  // public void setName(String name) {
  //   this.name = name;
  // }
  // public int getPrice() {
  //   return price;
  // }
  // public void setPrice(int price) {
  //   this.price = price;
  // }
  // @Override
  // public String toString() {
  //   return "Menu [id=" + id + ", name=" + name + ", price=" + price + "]";
  // }

  
}
