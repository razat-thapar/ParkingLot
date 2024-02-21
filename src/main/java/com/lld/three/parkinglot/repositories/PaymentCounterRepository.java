package com.lld.three.parkinglot.repositories;

import com.lld.three.parkinglot.models.PaymentCounter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentCounterRepository extends JpaRepository<PaymentCounter,Long> {
}
