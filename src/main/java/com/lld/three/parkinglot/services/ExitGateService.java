package com.lld.three.parkinglot.services;

import com.lld.three.parkinglot.models.ExitGate;
import com.lld.three.parkinglot.repositories.ExitGateRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ExitGateService {
    private ExitGateRepository exitGateRepository;

    public List<ExitGate> createAllExitGates(List<ExitGate> exitGates) {
        return exitGateRepository.saveAll(exitGates);
    }
}
