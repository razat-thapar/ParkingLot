package com.lld.three.parkinglot.services;

import com.lld.three.parkinglot.exceptions.ParkingLotNotFound;
import com.lld.three.parkinglot.models.*;
import com.lld.three.parkinglot.repositories.ParkingLotRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

//NOTE:
// 1. A service will call another service of another resource.
// 2. A service will call repository of same resource.
@Service
@AllArgsConstructor
public class ParkingLotService {
    private ParkingFloorService parkingFloorService;
    private ParkingSpotService parkingSpotService;
    private EntryGateService entryGateService;
    private ExitGateService exitGateService;
    private OperatorService operatorService;
    private DisplayBoardService displayBoardService;
    private PaymentCounterService paymentCounterService;
    private ParkingLotRepository parkingLotRepository;
    public ParkingLot getParkingLot(Long id){
        Optional<ParkingLot> result = parkingLotRepository.findById(id);
        if(result.isPresent()){
            return result.get();
        }
        throw new ParkingLotNotFound("Parking lot doesn't exist!");
    }
    public ParkingLot createParkingLot(ParkingLot parkingLot){
        //First save the parking lot.
        ParkingLot savedParkingLot = parkingLotRepository.save(parkingLot);
        //save the parking floor (map the saved parking lot)
        parkingLot.getFloorList().forEach(floor -> floor.setParkingLot(savedParkingLot));
        List<ParkingFloor> savedParkingFloors = parkingFloorService.createAllParkingFloors(parkingLot.getFloorList());
        savedParkingLot.setFloorList(savedParkingFloors);
        //save the parking spot. (map the saved parking floor)
        for(int i=0;i<savedParkingLot.getFloorList().size();i++){
            ParkingFloor savedParkingfloor = savedParkingLot.getFloorList().get(i);
            //set the saved parking floor in all it's spots.
            savedParkingfloor.getSpotList().forEach(spot -> spot.setParkingFloor(savedParkingfloor));
            //saving the parking spots and also setting it to savedParkingFloors.
            savedParkingFloors.get(i).setSpotList(parkingSpotService.createAllParkingSpots(savedParkingfloor.getSpotList()));
        }

        //save the entry gates. //map the floor-id , parking_lot_id , display_board_id , operator_id objects.
            //save the operator
            //save the display board. (map it's floor object)
        List<EntryGate> entryGates = new ArrayList<>();
        for(int i=0;i<savedParkingFloors.size() && i<parkingLot.getEntryGates().size();i++){
            //map 1 entry gate to each floor.
            ParkingFloor savedParkingFloor = savedParkingFloors.get(i);
            EntryGate entryGate = parkingLot.getEntryGates().get(i);
            entryGate.setParkingLot(savedParkingLot);
            entryGate.setFloor(savedParkingFloor);
            //operator.
            Operator operator = entryGate.getOperator();
            //save it and set it to entry gate
            entryGate.setOperator(operatorService.createOperator(operator));
            //display board
            DisplayBoard displayBoard = entryGate.getDisplayBoard();
            //set the floor
            displayBoard.setFloor(savedParkingFloor);
            //save it and set it to entry gate
            entryGate.setDisplayBoard(displayBoardService.createDisplayBoard(displayBoard));
            //add to list.
            entryGates.add(entryGate);
        }
        //save
        List<EntryGate> savedEntryGates  = entryGateService.createAllEntryGates(entryGates);
        ////set it to savedParkingLot.
        savedParkingLot.setEntryGates(savedEntryGates);


        //save the exit gates. //map the floor , parking lot ,  payment counter, operator objects.
            //save the operator
            //save the payment counter  ( map it's floor object)
        List<ExitGate> exitGates = new ArrayList<>();
        for(int i=0;i<savedParkingFloors.size() && i<parkingLot.getExitGates().size();i++){
            //map 1 exit gate to each floor.
            ParkingFloor savedParkingFloor = savedParkingFloors.get(i);
            ExitGate exitGate = parkingLot.getExitGates().get(i);
            //set lot to gate.
            exitGate.setParkingLot(savedParkingLot);
            //set floor to gate.
            exitGate.setFloor(savedParkingFloor);
            //operator.
            Operator operator = exitGate.getOperator();
            //save it and set it to entry gate
            exitGate.setOperator(operatorService.createOperator(operator));
            //payment counter.
            PaymentCounter paymentCounter = exitGate.getPaymentCounter();
            //set the floor
            paymentCounter.setFloor(savedParkingFloor);
            //save it and set it to entry gate
            exitGate.setPaymentCounter(paymentCounterService.createPaymentCounter(paymentCounter));
            //add to list.
            exitGates.add(exitGate);
        }
        //save all
        List<ExitGate> savedExitGates = exitGateService.createAllExitGates(exitGates);
        //set to lot.
        savedParkingLot.setExitGates(savedExitGates);

        return savedParkingLot;
    }
}
