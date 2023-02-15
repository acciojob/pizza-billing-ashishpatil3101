package com.driver;

public class Main {
  public static void main(String[] args) {

    DeluxePizza p=new DeluxePizza(true);
    p.addExtraCheese();
    p.addExtraToppings();
    p.addExtraToppings();
    p.addExtraCheese();


    System.out.println(p.getBill());


    DeluxePizza p1=new DeluxePizza(false);
    p1.addExtraCheese();
    p1.addExtraToppings();
    p1.addExtraToppings();
    p1.addExtraCheese();
    p1.addExtraToppings();


    System.out.println(p1.getBill());

  }
}