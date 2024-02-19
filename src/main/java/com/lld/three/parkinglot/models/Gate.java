package com.lld.three.parkinglot.models;

import com.lld.three.parkinglot.enums.GateType;

public abstract class Gate extends BaseModel {
    private Integer number;
    private GateType gateType;
    private Floor floor;
    private Operator operator;

}
