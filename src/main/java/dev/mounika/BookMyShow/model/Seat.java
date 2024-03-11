package dev.mounika.BookMyShow.model;

import dev.mounika.BookMyShow.model.constant.SeatStatus;
import dev.mounika.BookMyShow.model.constant.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter@Entity

public class Seat extends BaseModel{
    private int row;
    private int col;
    private String seatNumber;
    @Enumerated(EnumType.STRING)// creates a relationship between the entity class and the enum in DB

    private SeatType seatType;
    @Enumerated(EnumType.STRING)// creates a relationship between the entity class and the enum in DB
    private SeatStatus seatStatus;

}
