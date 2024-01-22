package com.hrs.hotel.controller;

import com.hrs.hotel.api.HotelApi;
import com.hrs.hotel.model.Hotel;
import com.hrs.hotel.service.HotelService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Hotel controller.
 */
@RestController
@AllArgsConstructor
@Validated
public class HotelController implements HotelApi {
    private HotelService hotelService;

    @Override
    public ResponseEntity<Hotel> getHotelById(Long hotelId) {
        return new ResponseEntity<>(hotelService.getHotelById(hotelId),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Hotel> createHotel(Hotel hotel) {
        return new ResponseEntity<>(hotelService.addHotel(hotel),HttpStatus.CREATED);
    }
}
