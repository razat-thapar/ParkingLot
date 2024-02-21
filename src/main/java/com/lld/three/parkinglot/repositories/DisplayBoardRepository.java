package com.lld.three.parkinglot.repositories;

import com.lld.three.parkinglot.models.DisplayBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisplayBoardRepository extends JpaRepository<DisplayBoard,Long> {
}
