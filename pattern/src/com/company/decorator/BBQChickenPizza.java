package com.company.decorator;

public class BBQChickenPizza extends PizzaDecorator {
    int tax = 250;

    BBQChickenPizza(Pizza p)
    {
        this.pizza=p;

    }
    public double getCost()
    {
        return pizza.getCost()+tax;
    }
}
