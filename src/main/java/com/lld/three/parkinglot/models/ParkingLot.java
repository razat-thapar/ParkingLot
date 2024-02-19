package com.lld.three.parkinglot.models;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot extends BaseModel{
    private String name;
    private List<Floor> floorList = new ArrayList<>();
    private List<EntryGate> entryGates = new ArrayList<>();
    private List<ExitGate> exitGates = new ArrayList<>();
}
