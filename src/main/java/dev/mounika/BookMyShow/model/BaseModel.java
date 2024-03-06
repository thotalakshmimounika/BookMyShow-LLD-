package dev.mounika.BookMyShow.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@MappedSuperclass
public abstract class BaseModel {
    @Id//tells that the attribute private int id- is a primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    //These annotation wil help to convert java code to sql database , it will help spring boot to understand for which java code
    //to convert into sql

    private int id;
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;
}
