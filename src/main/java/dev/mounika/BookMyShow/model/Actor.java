package dev.mounika.BookMyShow.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Actor extends BaseModel{
    //@Column(name = "Actor_name")
    private String name;
}
