package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheese;
    private int toppings;
    private int bag;

    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeAway;
    private boolean billGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.bag = 20;
        this.cheese = 80;
        this.bill = "";

        extraCheese = false;
        extraToppings = false;
        takeAway = false;
        billGenerated = false;

        if(isVeg){
            this.price = 300;
            this.toppings = 70;
        }
        else{
            this.price = 400;
            this.toppings = 120;
        }

        this.bill += "Base Price Of The Pizza: " + price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.extraCheese){
            this.price += this.cheese;
            this.extraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.extraToppings){
            this.price += this.toppings;
            this.extraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.takeAway){
            this.price += this.bag;
            this.takeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if (!billGenerated) {
            if (this.extraCheese) {
                this.bill += "Extra Cheese Added: " + this.cheese + "\n";
            }
            if (this.extraToppings) {
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            }
            if (this.takeAway) {
                this.bill += "Paperbag Added: " + this.bag + "\n";
            }
            this.bill += "Total Price: " + this.price + "\n";

            billGenerated = true;
        }
        return this.bill;
    }
}
