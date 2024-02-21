package com.lld.three.parkinglot.exceptions;

public class ParkingLotNotFound extends RuntimeException {
    //404 error.
    public ParkingLotNotFound(String message){
        super(message);
    }
}
