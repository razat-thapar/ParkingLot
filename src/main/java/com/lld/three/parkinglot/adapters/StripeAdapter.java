package com.lld.three.parkinglot.adapters;

import com.lld.three.parkinglot.enums.PaymentStatus;
import com.lld.three.parkinglot.models.PaymentGateway;
import com.lld.three.parkinglot.dtos.PaymentGatewayRequest;
import com.lld.three.parkinglot.dtos.PaymentGatewayResponse;
import com.lld.three.parkinglot.sdks.StripeApi;

public class StripeAdapter extends PaymentGateway {
    private StripeApi stripeApi;
    @Override
    public PaymentGatewayResponse makePayment(PaymentGatewayRequest paymentGatewayRequest) {
        //TODO: Stripe API
        return null;
    }

    @Override
    public PaymentStatus checkStatus(Integer transactionId) {
        return null;
    }
}
