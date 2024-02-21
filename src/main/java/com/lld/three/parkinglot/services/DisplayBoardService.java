package com.lld.three.parkinglot.services;

import com.lld.three.parkinglot.exceptions.DisplayBoardInvalidRequest;
import com.lld.three.parkinglot.models.DisplayBoard;
import com.lld.three.parkinglot.repositories.DisplayBoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DisplayBoardService {
    private DisplayBoardRepository displayBoardRepository;

    public DisplayBoard createDisplayBoard(DisplayBoard displayBoard){
        validate(displayBoard);
        return displayBoardRepository.save(displayBoard);
    }

    private static void validate(DisplayBoard displayBoard) {
        //validate if floor is mapped to a display board.
        if(displayBoard.getFloor()==null){
            throw new DisplayBoardInvalidRequest("Please map the floor in display board!");
        }
    }
}
