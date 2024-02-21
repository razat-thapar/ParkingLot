package com.lld.three.parkinglot.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@NoArgsConstructor
@Getter
@Setter
public class ExitGate extends Gate{
    @OneToOne
    private PaymentCounter paymentCounter ;
    @ManyToOne
    @JsonBackReference
    private ParkingLot parkingLot ;
}
