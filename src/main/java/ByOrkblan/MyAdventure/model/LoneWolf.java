package ByOrkblan.MyAdventure.model;


import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class LoneWolf {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
