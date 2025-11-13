package ByOrkblan.MyAdventure.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String note;
    @ManyToOne @JoinColumn(name="adventure_id", nullable = false)
    @JsonBackReference
    private Adventure adventureNote;


}
