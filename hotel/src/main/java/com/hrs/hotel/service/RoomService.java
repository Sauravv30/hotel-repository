package com.hrs.hotel.service;

import com.hrs.hotel.entity.RoomEntity;
import com.hrs.hotel.exception.BookingCustomException;
import com.hrs.hotel.exception.NotFoundCustomException;
import com.hrs.hotel.mapper.HotelMapper;
import com.hrs.hotel.mapper.RoomMapper;
import com.hrs.hotel.repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.hrs.hotel.model.Room;

/**
 * The type Room service.
 */
@Service
@AllArgsConstructor
public class RoomService {

    private RoomRepository roomRepository;
    private RoomMapper roomMapper;

    /**
     * Gets room details by id.
     *
     * @param id the id
     * @return the room details by id
     */
    public Room getRoomDetailsById(long id) {
        return roomMapper.entityToModel(getRoomById(id));
    }

    private RoomEntity getRoomById(long id) {
        return roomRepository.findById(id).orElseThrow(() -> new NotFoundCustomException("Did not find room with id " + id));
    }

    /**
     * Add room details room.
     *
     * @param room the room
     * @return the room
     */
    public Room addRoomDetails(Room room) {
        return roomMapper.entityToModel(roomRepository.save(roomMapper.modelToEntity(room)));
    }

    /**
     * Update room details room.
     *
     * @param id   the id
     * @param room the room
     * @return the room
     */
    public Room updateRoomDetails(long id, Room room) {
        RoomEntity persistedEntity = getRoomById(id);
        persistedEntity.getId();
        RoomEntity newEntity = roomMapper.modelToEntity(room);
        newEntity.setId(id);
        return roomMapper.entityToModel(roomRepository.save(newEntity));
    }

    /**
     * Book hotel room room.
     *
     * @param roomId the room id
     * @param status the status
     * @return the room
     */
    public Room bookHotelRoom(long roomId, String status) {
        RoomEntity persistedEntity = getRoomById(roomId);
        if (persistedEntity.isBooked() && "Booking".equals(status)) {
            throw new BookingCustomException("Room is already booked");
        }
        if (status.equals("Booking")) {
            persistedEntity.setBooked(true);
        } else {
            persistedEntity.setBooked(false);
        }
        return roomMapper.entityToModel(roomRepository.save(persistedEntity));
    }

}
