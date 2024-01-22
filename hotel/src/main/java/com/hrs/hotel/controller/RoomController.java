package com.hrs.hotel.controller;

import com.hrs.hotel.api.RoomApi;
import com.hrs.hotel.model.Room;
import com.hrs.hotel.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Room controller.
 */
@RestController
@AllArgsConstructor
@Validated

public class RoomController implements com.hrs.hotel.api.RoomApi {

    private RoomService roomService;
    @Override
    public ResponseEntity<Room> addRoomDetails(Room room) {
        return new ResponseEntity<>(roomService.addRoomDetails(room), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Room> getRoomDetails(Long roomId) {
        return new ResponseEntity<>(roomService.getRoomDetailsById(roomId),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Room> updateRoomDetails(Long roomId, Room room) {
        return new ResponseEntity<>(roomService.updateRoomDetails(roomId, room), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Room> bookHotelRoom(Long roomId, String status) {
        return new ResponseEntity<>(roomService.bookHotelRoom(roomId, status), HttpStatus.OK);
    }
}
