package com.driver;

public class Pizza {

    private int price=400;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int topping;
    private boolean flag_takeway;
    private int topping_price;
    private int extra_bag=0;

    public Pizza(boolean isVeg,String isdeluxe){
        this.isVeg = isVeg;
        // your code goes here
        this.flag_takeway=false;
       extra_bag=0;
        this.cheese+=80;
        this.topping = 0;
        if(isVeg==true) {
            this.topping_price = 70;
            this.price = 300;
            this.topping +=70;
        }
        else{
            this.topping_price = 120;
            this.price = 400;
            this.topping +=120;
        }
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.flag_takeway=false;
        this.cheese=0;
        this.topping = 0;
      extra_bag=0;
        if(isVeg==true) {
            this.topping_price = 70;
            this.price = 300;

        }
        else{
            this.topping_price = 120;
            this.price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.cheese+=80;
    }

    public void addExtraToppings(){
        // your code goes here
        this.topping+=this.topping_price;
    }

    public void addTakeaway(){
        // your code goes here
        flag_takeway=true;
        this.extra_bag=20;

    }


    public String getBill(){
        // your code goes her
        //System.out.println(this.price+this.cheese+this.topping+this.extra_bag);
        return "Base Price Of The Pizza:"+" "+price+"\n"+
        "Extra Cheese Added:"+" "+this.cheese+"\n"+
        "Extra Toppings Added:"+" "+this.topping+"\n"+
        "Paperbag Added: "+this.extra_bag+"\n"+
        "Total Price:"+" "+ (this.price+this.cheese+this.topping+this.extra_bag);
    }
}
