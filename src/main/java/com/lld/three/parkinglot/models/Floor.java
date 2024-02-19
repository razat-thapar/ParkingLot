package com.lld.three.parkinglot.models;

import java.util.ArrayList;
import java.util.List;

public class Floor extends BaseModel{
    private int floorNumber; //this is unique number of a floor within a parking lot.
    private List<ParkingSpot> spotList = new ArrayList<>();
    private PaymentCounter paymentCounter;
    private DisplayBoard displayBoard;

}
