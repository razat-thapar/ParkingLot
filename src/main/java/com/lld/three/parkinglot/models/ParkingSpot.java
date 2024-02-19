package com.lld.three.parkinglot.models;

import com.lld.three.parkinglot.enums.SpotStatus;
import com.lld.three.parkinglot.enums.SpotType;

public class ParkingSpot extends BaseModel{
    private Integer spotNumber; //this is unique number of a spot within a parking lot.
    private SpotType spotType;
    private SpotStatus spotStatus;
}
