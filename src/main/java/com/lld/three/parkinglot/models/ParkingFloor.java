package com.lld.three.parkinglot.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;
@Entity
@SuperBuilder
@NoArgsConstructor
@Getter
@Setter
public class ParkingFloor extends BaseModel{
    private int floorNumber; //this is unique number of a floor within a parking lot.
    @OneToMany(mappedBy = "parkingFloor")
    @JsonManagedReference
    private List<ParkingSpot> spotList = new ArrayList<>();
    @OneToOne(mappedBy = "floor")
    @JsonManagedReference
    private PaymentCounter paymentCounter;
    @OneToOne(mappedBy = "floor")
    @JsonManagedReference
    private DisplayBoard displayBoard;
    @ManyToOne
    @JsonBackReference
    private ParkingLot parkingLot;

}
