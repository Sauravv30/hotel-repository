package com.hrs.hotel.mapper;

import com.hrs.hotel.entity.HotelEntity;
import com.hrs.hotel.model.Hotel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-29T08:47:33+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class HotelMapperImpl implements HotelMapper {

    @Override
    public HotelEntity modelToEntity(Hotel hotel) {
        if ( hotel == null ) {
            return null;
        }

        HotelEntity hotelEntity = new HotelEntity();

        hotelEntity.setId( hotel.getId() );
        hotelEntity.setName( hotel.getName() );
        hotelEntity.setLocation( hotel.getLocation() );

        return hotelEntity;
    }
}
