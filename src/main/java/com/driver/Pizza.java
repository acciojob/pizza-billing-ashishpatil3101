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
        this.cheese=1;
        this.topping = 1;
        if(isVeg==true) {
            this.topping_price = 70;
            this.price = 300;

        }
        else{
            this.topping_price = 120;
            this.price = 400;
        }
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.flag_takeway=false;
        this.cheese=0;
        this.topping = 0;
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
        this.cheese+=1;
    }

    public void addExtraToppings(){
        // your code goes here
        this.topping+=1;
    }

    public void addTakeaway(){
        // your code goes here
        flag_takeway=true;
        this.extra_bag=20;

    }


    public String getBill(){
        // your code goes here
        return "Base Price Of The Pizza:"+" "+price+"\n"+
        "Extra Cheese Added:"+" "+cheese*80+"\n"+
        "Extra Toppings Added:"+" "+ topping*topping_price+"\n"+
        "Paperbag Added: 20"+"\n"+
        "Total Price:"+" "+ (price+cheese*80+topping_price*topping+extra_bag);
    }
}
