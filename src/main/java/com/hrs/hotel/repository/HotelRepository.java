package com.hrs.hotel.repository;


import com.hrs.hotel.entity.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * The interface Hotel repository.
 */
@Repository
public interface HotelRepository extends JpaRepository<HotelEntity, Long> {


//    Optional<HotelEntity> findByHotelAndRoomId(long hotelId, long roomId);
}
