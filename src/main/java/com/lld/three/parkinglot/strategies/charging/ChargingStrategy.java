package com.lld.three.parkinglot.strategies.charging;

import com.lld.three.parkinglot.enums.VehicleType;

import java.util.Date;

public interface ChargingStrategy {
    Double computeFee(Date entryTime, Date exitTime, VehicleType vehicleType);
}
