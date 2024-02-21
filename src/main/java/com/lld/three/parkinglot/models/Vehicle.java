package com.lld.three.parkinglot.models;

import com.lld.three.parkinglot.enums.VehicleType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Vehicle extends BaseModel{
    @Column(unique = true,nullable = false)
    private String registrationNumber;
    private VehicleType vehicleType;
}
