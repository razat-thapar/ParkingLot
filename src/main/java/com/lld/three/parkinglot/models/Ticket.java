package com.lld.three.parkinglot.models;

import com.lld.three.parkinglot.strategies.charging.ChargingStrategy;
import com.lld.three.parkinglot.strategies.finding.SpotFindingStrategy;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
@Entity
public class Ticket extends BaseModel{
    @OneToOne
    private Vehicle vehicle;
    @Temporal(value=TemporalType.TIMESTAMP)
    private LocalDateTime entryTime;
    @ManyToOne
    private ParkingLot parkingLot;
    @ManyToOne
    private ParkingSpot parkingSpot;
    @ManyToOne
    private ParkingFloor floor;
    @Transient
    private ChargingStrategy chargingStrategy;
    @Transient
    private SpotFindingStrategy spotFindingStrategy;
}
