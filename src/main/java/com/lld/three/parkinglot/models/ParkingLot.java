package com.lld.three.parkinglot.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class ParkingLot extends BaseModel{
    private String name;
    private String address;
    @OneToMany(mappedBy = "parkingLot")
    @JsonManagedReference
    private List<ParkingFloor> floorList = new ArrayList<>();
    @OneToMany(mappedBy = "parkingLot")
    @JsonManagedReference
    private List<EntryGate> entryGates = new ArrayList<>();
    @OneToMany(mappedBy = "parkingLot")
    @JsonManagedReference
    private List<ExitGate> exitGates = new ArrayList<>();
}
