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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return !(carName != null ? !carName.equals(car.carName) : car.carName != null);

    }

    @Override
    public int hashCode() {
        return carName != null ? carName.hashCode() : 0;
    }
}
