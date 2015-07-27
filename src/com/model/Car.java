package com.model;

/**
 * Created by ROHIT on 27-07-2015.
 */
public class Car {

    private String carName;

    public Car(){}

    public Car(String carName){
        this.carName = carName;
    }


    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
