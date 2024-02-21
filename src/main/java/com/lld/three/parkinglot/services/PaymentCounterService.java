package com.lld.three.parkinglot.services;

import com.lld.three.parkinglot.exceptions.InvalidPaymentCounterRequest;
import com.lld.three.parkinglot.models.PaymentCounter;
import com.lld.three.parkinglot.repositories.PaymentCounterRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PaymentCounterService {
    private PaymentCounterRepository paymentCounterRepository;

    public PaymentCounter createPaymentCounter(PaymentCounter paymentCounter){
        validate(paymentCounter);
        return paymentCounterRepository.save(paymentCounter);
    }

    private static void validate(PaymentCounter paymentCounter) {
        //check if floor is mapped to payment counter.
        if(paymentCounter.getFloor()==null){
            throw new InvalidPaymentCounterRequest("Missing floor for payment counter");
        }
    }

}
