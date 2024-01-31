package com.hrs.hotel.mapper;

import com.hrs.hotel.constants.RoomType;
import com.hrs.hotel.entity.HotelEntity;
import com.hrs.hotel.entity.RoomEntity;
import com.hrs.hotel.model.Hotel;
import com.hrs.hotel.model.Room;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-29T08:47:15+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class RoomMapperImpl implements RoomMapper {

    @Override
    public RoomEntity modelToEntity(Room room) {
        if ( room == null ) {
            return null;
        }

        RoomEntity roomEntity = new RoomEntity();

        roomEntity.setId( room.getId() );
        roomEntity.setNumber( room.getNumber() );
        if ( room.getBooked() != null ) {
            roomEntity.setBooked( room.getBooked() );
        }
        roomEntity.setRoomType( roomTypeEnumToRoomType( room.getRoomType() ) );
        roomEntity.setHotel( hotelToHotelEntity( room.getHotel() ) );

        return roomEntity;
    }

    @Override
    public Room entityToModel(RoomEntity roomEntity) {
        if ( roomEntity == null ) {
            return null;
        }

        Room room = new Room();

        room.setId( roomEntity.getId() );
        room.setNumber( roomEntity.getNumber() );
        room.setBooked( roomEntity.isBooked() );
        room.setHotel( hotelEntityToHotel( roomEntity.getHotel() ) );
        room.setRoomType( roomTypeToRoomTypeEnum( roomEntity.getRoomType() ) );

        return room;
    }

    protected RoomType roomTypeEnumToRoomType(Room.RoomTypeEnum roomTypeEnum) {
        if ( roomTypeEnum == null ) {
            return null;
        }

        RoomType roomType;

        switch ( roomTypeEnum ) {
            case SINGLE: roomType = RoomType.SINGLE;
            break;
            case DOUBLE: roomType = RoomType.DOUBLE;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + roomTypeEnum );
        }

        return roomType;
    }

    protected HotelEntity hotelToHotelEntity(Hotel hotel) {
        if ( hotel == null ) {
            return null;
        }

        HotelEntity hotelEntity = new HotelEntity();

        hotelEntity.setId( hotel.getId() );
        hotelEntity.setName( hotel.getName() );
        hotelEntity.setLocation( hotel.getLocation() );

        return hotelEntity;
    }

    protected Hotel hotelEntityToHotel(HotelEntity hotelEntity) {
        if ( hotelEntity == null ) {
            return null;
        }

        Hotel hotel = new Hotel();

        hotel.setId( hotelEntity.getId() );
        hotel.setName( hotelEntity.getName() );
        hotel.setLocation( hotelEntity.getLocation() );

        return hotel;
    }

    protected Room.RoomTypeEnum roomTypeToRoomTypeEnum(RoomType roomType) {
        if ( roomType == null ) {
            return null;
        }

        Room.RoomTypeEnum roomTypeEnum;

        switch ( roomType ) {
            case SINGLE: roomTypeEnum = Room.RoomTypeEnum.SINGLE;
            break;
            case DOUBLE: roomTypeEnum = Room.RoomTypeEnum.DOUBLE;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + roomType );
        }

        return roomTypeEnum;
    }
}
