package com.lld.three.parkinglot.models;

import com.lld.three.parkinglot.dtos.PaymentGatewayRequest;
import com.lld.three.parkinglot.dtos.PaymentGatewayResponse;
import com.lld.three.parkinglot.enums.PaymentStatus;

public abstract class PaymentGateway extends BaseModel{
    public abstract PaymentGatewayResponse makePayment(PaymentGatewayRequest paymentGatewayRequest);
    public abstract PaymentStatus checkStatus(Integer transactionId);
}
