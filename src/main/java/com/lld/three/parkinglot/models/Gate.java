package com.lld.three.parkinglot.models;

import com.lld.three.parkinglot.enums.GateType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@MappedSuperclass
@SuperBuilder
@NoArgsConstructor
@Setter
@Getter
public abstract class Gate extends BaseModel {
    private Integer number;
    private GateType gateType;
    @ManyToOne
    private ParkingFloor floor;
    @OneToOne
    private Operator operator;

}
