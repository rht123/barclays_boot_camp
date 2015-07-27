package com.model;

/**
 * Created by ROHIT on 27-07-2015.
 */
public class ParkingOwnerTest extends ParkingLotOwner {

    public boolean isFull = false;

    @Override
    public void notificationSend(){
        isFull = true;
    }
}
