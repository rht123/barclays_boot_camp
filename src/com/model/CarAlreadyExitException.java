package com.model;

/**
 * Created by ROHIT on 27-07-2015.
 */
public class CarAlreadyExitException extends RuntimeException {

    public CarAlreadyExitException(String msg) {
        super(msg);
    }
}
