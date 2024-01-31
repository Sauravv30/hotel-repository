package com.hrs.hotel.mapper;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.hrs.hotel.entity.HotelEntity;
import com.hrs.hotel.model.Hotel;
import com.hrs.hotel.model.Room;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * The interface Hotel mapper.
 */
@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)

public interface HotelMapper {

    /**
     * Model to entity hotel entity.
     *
     * @param hotel the hotel
     * @return the hotel entity
     */
    HotelEntity modelToEntity(Hotel hotel);

    /**
     * Entity to model hotel.
     *
     * @param hotelEntity the hotel entity
     * @return the hotel
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonIgnore()
    default Hotel entityToModel(HotelEntity hotelEntity) {
        Hotel hotel = new Hotel(hotelEntity.getName(), hotelEntity.getLocation()).id(hotelEntity.getId());
        if (null != hotelEntity.getRooms()) {
            hotel.setRoom(hotelEntity.getRooms().stream().map(entity -> new Room().id(entity.getId()).number(entity.getNumber())
                            .booked(entity.isBooked()).roomType(Room.RoomTypeEnum.fromValue(entity.getRoomType().name())))
                    .collect(Collectors.toList()));
        }
        return hotel;
    }

}
