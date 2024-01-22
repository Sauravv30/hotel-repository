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

    /**
     * Add room details response entity.
     *
     * @param room the room
     * @return the response entity
     */
    @Override
    public ResponseEntity<Room> addRoomDetails(Room room) {
        return new ResponseEntity<>(roomService.addRoomDetails(room), HttpStatus.CREATED);
    }

    /**
     * Gets room details.
     *
     * @param roomId the room id
     * @return the room details
     */
    @Override
    public ResponseEntity<Room> getRoomDetails(Long roomId) {
        return new ResponseEntity<>(roomService.getRoomDetailsById(roomId),HttpStatus.OK);
    }

    /**
     * Update room details response entity.
     *
     * @param roomId the room id
     * @param room   the room
     * @return the response entity
     */
    @Override
    public ResponseEntity<Room> updateRoomDetails(Long roomId, Room room) {
        return new ResponseEntity<>(roomService.updateRoomDetails(roomId, room), HttpStatus.OK);
    }

    /**
     * Book hotel room response entity.
     *
     * @param roomId the room id
     * @param status the status
     * @return the response entity
     */
    @Override
    public ResponseEntity<Room> bookHotelRoom(Long roomId, String status) {
        return new ResponseEntity<>(roomService.bookHotelRoom(roomId, status), HttpStatus.OK);
    }
}
