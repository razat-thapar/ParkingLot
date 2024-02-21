package com.lld.three.parkinglot.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
public class Invoice extends BaseModel{
    @Temporal(value= TemporalType.TIMESTAMP)
    private LocalDateTime exitTime;
    @OneToOne
    private Ticket ticket;
    private Double totalAmount;
    @OneToMany(mappedBy = "invoice")
    private List<Payment> paymentList = new ArrayList<>();
}
