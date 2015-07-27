package com.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ROHIT on 27-07-2015.
 */
public class ParkingLot {

    List<Car> cars = new ArrayList<Car>();
    private int capacity;
    private static int currentCount;

    public ParkingLot(){}

    public ParkingLot(int capacity){
        this.capacity = capacity;
    }

    public int parkingOfCar(Car c) throws ParkingLotFullException {
           if(currentCount == capacity) {
               throw new ParkingLotFullException("Parking space not available!!");
           }else{
                   cars.add(c);
                   return ++currentCount;
               }

    }

    public int getToken() {
        return currentCount;
    }

    public void setToken(int token) {
        this.currentCount = token;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
