package com.lld.three.parkinglot.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude
@Setter
@Getter
public class EntryGate extends Gate{
    @OneToOne
    private DisplayBoard displayBoard;
    @ManyToOne
    @JsonBackReference
    private ParkingLot parkingLot;

}
