package com.lld.three.parkinglot.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@NoArgsConstructor
@Getter
public class Operator extends BaseModel {
    @Column(nullable = false)
    private String name;
    @Column(nullable=false)
    private String email;
    private Long phoneNumber;
}
