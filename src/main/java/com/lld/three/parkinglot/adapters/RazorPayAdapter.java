package com.lld.three.parkinglot.adapters;

import com.lld.three.parkinglot.enums.PaymentStatus;
import com.lld.three.parkinglot.models.PaymentGateway;
import com.lld.three.parkinglot.dtos.PaymentGatewayRequest;
import com.lld.three.parkinglot.dtos.PaymentGatewayResponse;
import com.lld.three.parkinglot.sdks.RazorPayApi;

public class RazorPayAdapter extends PaymentGateway {
    private RazorPayApi razorPayApi;
    @Override
    public PaymentGatewayResponse makePayment(PaymentGatewayRequest paymentGatewayRequest) {
        return null;
    }

    @Override
    public PaymentStatus checkStatus(Integer transactionId) {
        return null;
    }
}
