package ByOrkblan.MyAdventure.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Adventure {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany(mappedBy = "adventureNote", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Note> notes;
    @OneToMany(mappedBy = "adventureBag", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Bag> itemBag;
    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    @JsonBackReference
    private User user;
    private String title;
    private int chapter;

    public void addNote(Note note) {
        notes.add(note);
        note.setAdventureNote(this);
    }

    public void addBag(Bag bag){
        itemBag.add(bag);
        bag.setAdventureBag(this);
    }
}