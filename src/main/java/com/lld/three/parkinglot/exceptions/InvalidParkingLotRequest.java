package com.lld.three.parkinglot.exceptions;

public class InvalidParkingLotRequest extends RuntimeException {
    //400 Bad Request
    public InvalidParkingLotRequest(String message) {
        super(message);
    }
}
