package com.lld.three.parkinglot.services;

import com.lld.three.parkinglot.exceptions.OperatorMandatoryDetailsNotFilled;
import com.lld.three.parkinglot.models.Operator;
import com.lld.three.parkinglot.repositories.OperatorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OperatorService {
    private OperatorRepository operatorRepository;

    public Operator createOperator(Operator operator){
        validate(operator);
        return operatorRepository.save(operator);
    }

    private static void validate(Operator operator) {
        //validate if name and email are not null.
        if(operator.getName()==null || operator.getEmail()==null){
            throw new OperatorMandatoryDetailsNotFilled("Name or Email can't be null!");
        }
    }

}
