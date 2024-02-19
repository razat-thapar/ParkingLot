package com.lld.three.parkinglot.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Invoice extends BaseModel{
    private LocalDateTime exitTime;
    private Ticket ticket;
    private Double totalAmount;
    private List<Payment> paymentList = new ArrayList<>();
}
