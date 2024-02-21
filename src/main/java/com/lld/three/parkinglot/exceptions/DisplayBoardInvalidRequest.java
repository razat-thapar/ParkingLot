package com.lld.three.parkinglot.exceptions;

public class DisplayBoardInvalidRequest extends RuntimeException {
    //400 Bad request.
    public DisplayBoardInvalidRequest(String s) {
        super(s);
    }
}
