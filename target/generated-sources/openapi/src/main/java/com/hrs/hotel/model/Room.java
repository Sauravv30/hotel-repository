package com.hrs.hotel.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hrs.hotel.model.Hotel;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Room
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-29T08:47:04.694502800+05:30[Asia/Calcutta]")
public class Room {

  private Long id;

  private String number;

  private Boolean booked = false;

  private Hotel hotel;

  /**
   * Available room type
   */
  public enum RoomTypeEnum {
    SINGLE("SINGLE"),
    
    DOUBLE("DOUBLE");

    private String value;

    RoomTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoomTypeEnum fromValue(String value) {
      for (RoomTypeEnum b : RoomTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private RoomTypeEnum roomType;

  public Room id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Room number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  
  @Schema(name = "number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Room booked(Boolean booked) {
    this.booked = booked;
    return this;
  }

  /**
   * Get booked
   * @return booked
  */
  
  @Schema(name = "booked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("booked")
  public Boolean getBooked() {
    return booked;
  }

  public void setBooked(Boolean booked) {
    this.booked = booked;
  }

  public Room hotel(Hotel hotel) {
    this.hotel = hotel;
    return this;
  }

  /**
   * Get hotel
   * @return hotel
  */
  @Valid 
  @Schema(name = "hotel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hotel")
  public Hotel getHotel() {
    return hotel;
  }

  public void setHotel(Hotel hotel) {
    this.hotel = hotel;
  }

  public Room roomType(RoomTypeEnum roomType) {
    this.roomType = roomType;
    return this;
  }

  /**
   * Available room type
   * @return roomType
  */
  
  @Schema(name = "roomType", description = "Available room type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roomType")
  public RoomTypeEnum getRoomType() {
    return roomType;
  }

  public void setRoomType(RoomTypeEnum roomType) {
    this.roomType = roomType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Room room = (Room) o;
    return Objects.equals(this.id, room.id) &&
        Objects.equals(this.number, room.number) &&
        Objects.equals(this.booked, room.booked) &&
        Objects.equals(this.hotel, room.hotel) &&
        Objects.equals(this.roomType, room.roomType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number, booked, hotel, roomType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Room {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    booked: ").append(toIndentedString(booked)).append("\n");
    sb.append("    hotel: ").append(toIndentedString(hotel)).append("\n");
    sb.append("    roomType: ").append(toIndentedString(roomType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

