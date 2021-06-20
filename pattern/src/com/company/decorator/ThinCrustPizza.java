package com.company.decorator;

public class ThinCrustPizza extends Pizza {

    ThinCrustPizza(){
        this.description="thin crust pizza";
    }
    @Override
    public double getCost() {
        return 1500;
    }
}
