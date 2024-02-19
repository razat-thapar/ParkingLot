package com.lld.three.parkinglot.strategies.charging;

import com.lld.three.parkinglot.enums.VehicleType;

import java.util.Date;

public class HourlyChargingStrategy implements ChargingStrategy{

    @Override
    public Double computeFee(Date entryTime, Date exitTime, VehicleType vehicleType) {
        //TODO: Need to implement algorithm for hourly charging.
        return null;
    }
}
