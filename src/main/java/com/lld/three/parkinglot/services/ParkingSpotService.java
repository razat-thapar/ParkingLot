package com.lld.three.parkinglot.services;

import com.lld.three.parkinglot.models.ParkingSpot;
import com.lld.three.parkinglot.repositories.ParkingSpotRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ParkingSpotService {
    private ParkingSpotRepository parkingSpotRepository;

    public List<ParkingSpot> createAllParkingSpots(List<ParkingSpot> parkingSpotList){
        return parkingSpotRepository.saveAll(parkingSpotList);
    }
}
