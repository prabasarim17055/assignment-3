package com.company.decorator;

public class TandooriChickenPizza extends PizzaDecorator {
    int tax = 350;
    TandooriChickenPizza(Pizza p)
    {
        this.pizza=p;
    }
    public double getCost(){
        return pizza.getCost()+tax;
    }
}
