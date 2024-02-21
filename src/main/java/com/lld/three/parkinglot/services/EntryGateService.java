package com.lld.three.parkinglot.services;

import com.lld.three.parkinglot.models.EntryGate;
import com.lld.three.parkinglot.repositories.EntryGateRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EntryGateService {
    private EntryGateRepository entryGateRepository;

    public List<EntryGate> createAllEntryGates(List<EntryGate> entryGateList){
        return entryGateRepository.saveAll(entryGateList);
    }

}
