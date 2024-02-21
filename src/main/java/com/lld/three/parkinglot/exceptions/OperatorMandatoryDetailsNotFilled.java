package com.lld.three.parkinglot.exceptions;

public class OperatorMandatoryDetailsNotFilled extends RuntimeException {
    //400 Bad request.
    public OperatorMandatoryDetailsNotFilled(String s) {
        super(s);
    }
}
