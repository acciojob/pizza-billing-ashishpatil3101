package com.driver;

public class Main {
  public static void main(String[] args) {

    DeluxePizza p=new DeluxePizza(true);
    p.addExtraCheese();
    p.addExtraToppings();
    p.addExtraToppings();
    p.addExtraCheese();


    System.out.println(p.getBill());
  }
}