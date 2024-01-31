package com.hrs.hotel.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * The type Hotel entity.
 */
@Entity
@Getter
@Setter
public class HotelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hotel-sequence")
    @SequenceGenerator(name = "hotel-sequence", sequenceName = "hotel-sequence", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String location;

    @OneToMany(mappedBy="hotel", fetch = FetchType.LAZY)
    private List<RoomEntity> rooms;
}
