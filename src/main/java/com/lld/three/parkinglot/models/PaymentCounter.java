package com.lld.three.parkinglot.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class PaymentCounter extends BaseModel{
    @OneToOne
    @JsonBackReference
    private ParkingFloor floor;
}
