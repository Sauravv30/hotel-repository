package com.hrs.hotel.entity;

import com.hrs.hotel.constants.RoomType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * The type Room entity.
 */
@Entity
@Getter
@Setter
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "room-sequence")
    @SequenceGenerator(name = "room-sequence", sequenceName = "room-sequence", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotNull
    private String number;
    @NotNull
    private boolean booked;
    private RoomType roomType;
    @ManyToOne
    @JoinColumn(name = "hotel_id", nullable = false)
    private HotelEntity hotel;
}
