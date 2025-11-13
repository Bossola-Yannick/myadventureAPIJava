package ByOrkblan.MyAdventure.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Bag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String item;
    @ManyToOne
    @JoinColumn(name="adventure_id", nullable = true)
    @JsonBackReference
    private Adventure adventureBag;
}
