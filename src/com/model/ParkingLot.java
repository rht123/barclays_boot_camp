package com.model;

import java.util.*;

/**
 * Created by ROHIT on 27-07-2015.
 */
public class ParkingLot {

    Map<Integer, Car> cars;
    private int capacity;
    private int currentCount = 0;
    private boolean isFull = false;
    private ParkingLotOwner plo;

    public ParkingLot() {
    }

    public ParkingLot(ParkingLotOwner plo,int capacity){
        cars = new HashMap<Integer, Car>();
        this.plo = plo;
        this.capacity = capacity;
    }

    public int parkCar(Car c) {

        if (cars.containsValue(c))
            throw new CarAlreadyExitException("car already exists!");

        if(currentCount == capacity)
            throw new ParkingLotFullException("Parking space not available!!");

        if (currentCount +1 == capacity)
            plo.notificationSend();

        cars.put(currentCount, c);
        return currentCount++;
    }

    public Car unParkCar(int token){
        if(cars.get(token) == null )
            throw new CarNotFound("car not found!");
        else
            return cars.remove(token);
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
