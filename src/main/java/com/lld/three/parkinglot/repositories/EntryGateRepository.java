package com.lld.three.parkinglot.repositories;

import com.lld.three.parkinglot.models.EntryGate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryGateRepository extends JpaRepository<EntryGate,Long> {
}
