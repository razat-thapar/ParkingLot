package com.lld.three.parkinglot.services;

import com.lld.three.parkinglot.models.ParkingFloor;
import com.lld.three.parkinglot.repositories.ParkingFloorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ParkingFloorService {

    private ParkingFloorRepository parkingFloorRepository;

    public List<ParkingFloor> createAllParkingFloors(List<ParkingFloor> parkingFloorList){
        return parkingFloorRepository.saveAll(parkingFloorList);
    }
}
