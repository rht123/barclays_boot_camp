package com.model;

/**
 * Created by ROHIT on 27-07-2015.
 */
public class ParkingLotFullException extends RuntimeException{

    public ParkingLotFullException(String msg){
        super(msg);
    }
}
