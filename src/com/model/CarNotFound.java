package com.model;

import java.security.PublicKey;

/**
 * Created by ROHIT on 27-07-2015.
 */
public class CarNotFound extends RuntimeException {

    public CarNotFound(String msg){
        super(msg);
    }
}
