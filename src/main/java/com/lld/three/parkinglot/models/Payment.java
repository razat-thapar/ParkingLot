package com.lld.three.parkinglot.models;

import com.lld.three.parkinglot.enums.PaymentMode;
import com.lld.three.parkinglot.enums.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;

@Entity
public class Payment extends BaseModel{
    private Double amount;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    @ManyToOne
    private Invoice invoice;
    @Transient
    private PaymentGateway paymentGateway;
}
