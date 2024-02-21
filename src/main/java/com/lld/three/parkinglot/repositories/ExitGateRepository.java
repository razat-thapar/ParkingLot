package com.lld.three.parkinglot.repositories;

import com.lld.three.parkinglot.models.ExitGate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExitGateRepository extends JpaRepository<ExitGate,Long> {
}
