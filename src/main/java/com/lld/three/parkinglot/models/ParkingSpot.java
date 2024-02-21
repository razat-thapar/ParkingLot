package com.lld.three.parkinglot.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.lld.three.parkinglot.enums.SpotStatus;
import com.lld.three.parkinglot.enums.VehicleType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@NoArgsConstructor
@Setter
public class ParkingSpot extends BaseModel{
    private Integer spotNumber; //this is unique number of a spot within a parking lot.
    private VehicleType spotType; //as per our use case, each vehicle should be allocated to only it's designated spot.
    private SpotStatus spotStatus;
    @ManyToOne
    @JsonBackReference
    private ParkingFloor parkingFloor;
}
