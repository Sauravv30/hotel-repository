package com.hrs.hotel.service;

import com.hrs.hotel.exception.NotFoundCustomException;
import com.hrs.hotel.mapper.HotelMapper;
import com.hrs.hotel.repository.HotelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import  com.hrs.hotel.model.Hotel;

/**
 * The type Hotel service.
 */
@Service
@AllArgsConstructor
public class HotelService {
    private HotelRepository hotelRepository;
    private HotelMapper hotelMapper;


    /**
     * Get hotel by id hotel.
     *
     * @param hotelId the hotel id
     * @return the hotel
     */
    public Hotel getHotelById(long hotelId){
        return hotelMapper.entityToModel(hotelRepository.findById(hotelId).orElseThrow(()-> new NotFoundCustomException("Hotel not found for this id "+hotelId)));
    }

    /**
     * Add hotel hotel.
     *
     * @param hotel the hotel
     * @return the hotel
     */
    public Hotel addHotel(Hotel hotel){
        return hotelMapper.entityToModel(hotelRepository.save(hotelMapper.modelToEntity(hotel)));
    }

//    public Hotel getHotelByIdAndRoomId(long hotelId, long roomId){
//        return hotelMapper.entityToModel(hotelRepository.findByHotelAndRoomId(hotelId, roomId).orElseThrow(()-> new NotFoundCustomException("Hotel not found for this id "+hotelId)));
//    }

}
