package com.company.decorator;

public class ExtraCheese extends PizzaDecorator {
    int tax = 300;
    ExtraCheese(Pizza p)
    {
        this.pizza=p;
    }

    @Override
    public double getCost()
    {
        return pizza.getCost()+tax;
    }
}
