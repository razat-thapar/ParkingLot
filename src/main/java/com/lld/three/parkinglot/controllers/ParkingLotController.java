package com.lld.three.parkinglot.controllers;

import com.lld.three.parkinglot.dtos.CreateParkingLotRequest;
import com.lld.three.parkinglot.exceptions.InvalidParkingLotRequest;
import com.lld.three.parkinglot.exceptions.ParkingLotNotFound;
import com.lld.three.parkinglot.models.ParkingLot;
import com.lld.three.parkinglot.services.ParkingLotService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

//Responsibility : Expose API's to manage parking lot resource by ADMIN.
// Two main.
//1. Validate the request : Only for the request not the business logic.
//2. Data transformation : Transform request /response to what service needs.
@RestController
@AllArgsConstructor
public class ParkingLotController {
    //dependency.
    private ParkingLotService parkingLotService;
    //resource : ParkingLot.
    //API's : NEED CRUD API's.

    //GET PARKING LOT
    //GET /parking-lot/{id}
    @GetMapping("/parking-lot/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public @ResponseBody ParkingLot getParkingLot(@PathVariable(value="id") Long id){
        //request validation.
        validate(id);
        return parkingLotService.getParkingLot(id);
    }

    private static void validate(Long id) throws InvalidParkingLotRequest {
        if(id == null){
            throw new InvalidParkingLotRequest("id can't be null !");
        }

    }
    //GET ALL PARKING LOT
    //GET /parking-lot

    //CREATE A PARKING LOT
    //POST /parking-lot
    @PostMapping("/parking-lot")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody ParkingLot createParkingLot(@RequestBody CreateParkingLotRequest createParkingLotRequest){
        //validate the request.
        validateRequest(createParkingLotRequest);
        //transform my request to ParkingLot.
        return parkingLotService.createParkingLot(createParkingLotRequest.toParkingLot());
    }
    private static void validateRequest(CreateParkingLotRequest createParkingLotRequest) throws InvalidParkingLotRequest{
        if(createParkingLotRequest.getName() == null || createParkingLotRequest.getFloorSpotCountList() == null || createParkingLotRequest.getNoOfExitGates()==null || createParkingLotRequest.getNoOfEntryGates() == null){
            throw new InvalidParkingLotRequest ("All fields are mandatory !");
        }
        if(createParkingLotRequest.getNoOfEntryGates() > createParkingLotRequest.getFloorSpotCountList().size()
            || createParkingLotRequest.getNoOfExitGates() > createParkingLotRequest.getFloorSpotCountList().size()
        ){
            throw new InvalidParkingLotRequest ("Count of exit / entry gates should not exceed floor count initially!");
        }
    }

    //Update Parking lot
    //PUT /parking-lot/{id}  Request : UpdateParkingLotDTO  Response : ParkingLot
    //DELETE Parking lot
    //DELETE /parking-lot/{id}

}
