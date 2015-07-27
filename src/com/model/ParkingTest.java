package com.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ROHIT on 27-07-2015.
 */
public class ParkingTest {

    @Test
    public void TestShouldParkACar(){

        ParkingLot pk1 = new ParkingLot(new ParkingLotOwner(),2);

        int res1 = pk1.parkCar(new Car("honda"));
        int res2 = pk1.parkCar(new Car("nano"));

        assertEquals(0,res1);
        assertEquals(1,res2);

    }

    @Test
    public void TestUnParkCar(){

        ParkingLot pk6 = new ParkingLot(new ParkingLotOwner(),3);

        int p1 = pk6.parkCar(new Car("nano"));
        int p2 = pk6.parkCar(new Car("honda"));


        assertEquals("nano",pk6.unParkCar(0).getCarName());
        assertEquals("honda",pk6.unParkCar(1).getCarName());

    }



    @Test(expected = CarNotFound.class)
    public void TestShouldUnParkCar() throws CarNotFound{

        ParkingLot pk5 = new ParkingLot(new ParkingLotOwner(),2);

        int p1 = pk5.parkCar(new Car("nano"));
        int p2 = pk5.parkCar(new Car("honda"));

        Car res1 = pk5.unParkCar(1);
        Car res2 = pk5.unParkCar(100);


    }

    @Test(expected = ParkingLotFullException.class)
    public void ParkingIsFull() throws ParkingLotFullException{

        ParkingLot pk2 = new ParkingLot(new ParkingLotOwner(),2);
        int res1 = pk2.parkCar(new Car("honda"));
        int res2 = pk2.parkCar(new Car("nano"));
        int res3 = pk2.parkCar(new Car("audi"));

    }

    @Test(expected = CarAlreadyExitException.class)
    public void CarAlreadyExit() throws CarAlreadyExitException {
        ParkingLot pk3 = new ParkingLot(new ParkingLotOwner(),3);
        int res1 = pk3.parkCar(new Car("honda"));
        int res2 = pk3.parkCar(new Car("honda"));
    }


    @Test
    public void testOwnerIsNotifiedWhenParkingIsFull(){
        ParkingOwnerTest pol = new ParkingOwnerTest();

        ParkingLot pk4 = new ParkingLot(pol,2);
        int res1 = pk4.parkCar(new Car("honda"));
        int res2 = pk4.parkCar(new Car("nano"));
        //int res3 = pk4.parkCar(new Car("audi"));
        assertEquals(true,pol.isFull);
    }
}