package com.model;

import static org.junit.Assert.*;

/**
 * Created by ROHIT on 27-07-2015.
 */
public class ParkingTest {

    @Test
    public void testParking(){

        ParkingLot pk = new ParkingLot(2);
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        int res1 = pk.parkingOfCar(c1);
        int res2 = pk.parkingOfCar(c2);
        int res3 = pk.parkingOfCar(c3);

        assertEquals(0,res1);
        assertEquals(1,res2);
        assertEquals(-1,res3);


    }

}