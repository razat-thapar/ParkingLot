package com.lld.three.parkinglot.dtos;

import com.lld.three.parkinglot.enums.GateType;
import com.lld.three.parkinglot.enums.SpotStatus;
import com.lld.three.parkinglot.enums.VehicleType;
import com.lld.three.parkinglot.models.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
@Getter
public class CreateParkingLotRequest {
    private String name;
    private String address;
    private List<Integer> floorSpotCountList;
    private Integer noOfEntryGates;
    private Integer noOfExitGates;

    public ParkingLot toParkingLot() {
        //creating a floorList
        List<ParkingFloor> floorList = new ArrayList<>();
        floorSpotCountList.forEach((spotCount)->{
            //add all slots with MEDIUM SIZE , SPOT NUMBERS FROM 1 to N  , spot status as AVAILABLE
            List<ParkingSpot> parkingSpotList = new ArrayList<>();
            for(int spotNumber=1;spotNumber<=spotCount;spotNumber++){
                parkingSpotList.add(ParkingSpot
                        .builder()
                                .spotNumber(spotNumber)
                                .spotStatus(SpotStatus.AVAILABLE)
                                .spotType(VehicleType.MEDIUM)
                        .build());
            }
            //create a parking floor.
            ParkingFloor parkingFloor = ParkingFloor
                    .builder()
                    .spotList(parkingSpotList)
                    .floorNumber(floorList.size()) //empty list -> 0 ground floor.
                    .build();
            //add to floor list.
            floorList.add(parkingFloor);
        });
        //creating dummy entryGates.
        int gateNumber = 0;
        List<EntryGate> entryGateList = Collections.nCopies(noOfEntryGates,
                EntryGate
                .builder()
                .gateType(GateType.ENTRY)
                .number(++gateNumber)
                        .displayBoard(new DisplayBoard())
                        .operator(Operator
                                .builder()
                                .name(name+"_entry_"+gateNumber)
                                .email("dummy@gmail.com")
                                .build())
                .build()
        );
        //creating dummy exit gates.
        gateNumber = 0;
        List<ExitGate> exitGateList = Collections.nCopies(noOfExitGates,
                ExitGate
                        .builder()
                        .gateType(GateType.EXIT)
                        .number(++gateNumber)
                        .paymentCounter(new PaymentCounter())
                        .operator(Operator
                                .builder()
                                .name(name+"_exit_"+gateNumber)
                                .email("dummy@gmail.com")
                                .build())
                        .build()
        );
        return ParkingLot
                .builder()
                .name(name)
                .address(address)
                .floorList(floorList)
                .entryGates(entryGateList)
                .exitGates(exitGateList)
                .build();
    }
}
