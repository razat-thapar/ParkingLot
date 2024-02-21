package com.lld.three.parkinglot.enums;
//we should avoid using CAR,BIKE,TRUCK,CYCLE etc. as if a new vehicle type came to our parking lot then
// we won't be able to handle it even though we have sufficient parking space for it.
public enum VehicleType {
    LARGE,
    MEDIUM,
    SMALL
}
