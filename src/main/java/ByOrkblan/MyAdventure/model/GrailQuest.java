package ByOrkblan.MyAdventure.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class GrailQuest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
}
