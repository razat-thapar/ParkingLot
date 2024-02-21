package com.lld.three.parkinglot.exceptions;

public class InvalidPaymentCounterRequest extends RuntimeException {
    //400 bad request.
    public InvalidPaymentCounterRequest(String missingFloorForPaymentCounter) {
        super(missingFloorForPaymentCounter);
    }
}
