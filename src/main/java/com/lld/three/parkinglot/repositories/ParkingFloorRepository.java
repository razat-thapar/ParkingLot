package com.lld.three.parkinglot.repositories;

import com.lld.three.parkinglot.models.ParkingFloor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingFloorRepository extends JpaRepository<ParkingFloor,Long> {
}
