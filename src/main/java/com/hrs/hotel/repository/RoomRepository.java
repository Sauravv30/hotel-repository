package com.hrs.hotel.repository;

import com.hrs.hotel.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Room repository.
 */
@Repository
public interface RoomRepository extends JpaRepository<RoomEntity, Long> {
}
