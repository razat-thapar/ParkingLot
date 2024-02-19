package com.lld.three.parkinglot.strategies.finding;

import com.lld.three.parkinglot.enums.VehicleType;
import com.lld.three.parkinglot.models.ParkingLot;
import com.lld.three.parkinglot.models.ParkingSpot;

public interface SpotFindingStrategy {
    ParkingSpot find(ParkingLot parkingLot, VehicleType vehicleType);
}
