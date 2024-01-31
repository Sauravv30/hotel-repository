package com.hrs.hotel.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.hrs.hotel.model.Room;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Hotel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-29T08:47:04.694502800+05:30[Asia/Calcutta]")
public class Hotel {

  private Long id;

  private String name;

  private String location;

  @Valid
  private List<@Valid Room> room;

  /**
   * Default constructor
   * @deprecated Use {@link Hotel#Hotel(String, String)}
   */
  @Deprecated
  public Hotel() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Hotel(String name, String location) {
    this.name = name;
    this.location = location;
  }

  public Hotel id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Hotel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Hotel location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @NotNull 
  @Schema(name = "location", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Hotel room(List<@Valid Room> room) {
    this.room = room;
    return this;
  }

  public Hotel addRoomItem(Room roomItem) {
    if (this.room == null) {
      this.room = new ArrayList<>();
    }
    this.room.add(roomItem);
    return this;
  }

  /**
   * Get room
   * @return room
  */
  @Valid 
  @Schema(name = "room", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("room")
  public List<@Valid Room> getRoom() {
    return room;
  }

  public void setRoom(List<@Valid Room> room) {
    this.room = room;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hotel hotel = (Hotel) o;
    return Objects.equals(this.id, hotel.id) &&
        Objects.equals(this.name, hotel.name) &&
        Objects.equals(this.location, hotel.location) &&
        Objects.equals(this.room, hotel.room);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, location, room);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hotel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    room: ").append(toIndentedString(room)).append("\n");
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

