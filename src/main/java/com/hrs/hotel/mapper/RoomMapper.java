package com.hrs.hotel.mapper;

import com.hrs.hotel.entity.RoomEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

/**
 * The interface Room mapper.
 */
@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface RoomMapper {
    /**
     * Model to entity room entity.
     *
     * @param room the room
     * @return the room entity
     */
    RoomEntity modelToEntity(com.hrs.hotel.model.Room room);

    /**
     * Entity to model com . hrs . hotel . model . room.
     *
     * @param roomEntity the room entity
     * @return the com . hrs . hotel . model . room
     */
    com.hrs.hotel.model.Room entityToModel(RoomEntity roomEntity);


}
