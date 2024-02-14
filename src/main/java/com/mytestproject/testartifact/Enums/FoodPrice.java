package com.mytestproject.testartifact.Enums;

public enum FoodPrice {

    SAMOSA(15.0),
    KACHORI(20.0),
    RASMALAI(50.0);

    public double mvalue;

    private FoodPrice(double value){
        mvalue = value;
    }

}
