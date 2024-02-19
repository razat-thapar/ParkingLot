package com.lld.three.parkinglot.models;

import com.lld.three.parkinglot.strategies.charging.ChargingStrategy;
import com.lld.three.parkinglot.strategies.finding.SpotFindingStrategy;

import java.util.Date;

public class Ticket extends BaseModel{
    private Vehicle vehicle;
    private Date entryTime;
    private ParkingSpot parkingSpot;
    private Floor floor;
    private ChargingStrategy chargingStrategy;
    private SpotFindingStrategy spotFindingStrategy;
}
