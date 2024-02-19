package com.lld.three.parkinglot.models;

import com.lld.three.parkinglot.enums.PaymentMode;
import com.lld.three.parkinglot.enums.PaymentStatus;

public class Payment extends BaseModel{
    private Double amount;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private PaymentGateway paymentGateway;
}
