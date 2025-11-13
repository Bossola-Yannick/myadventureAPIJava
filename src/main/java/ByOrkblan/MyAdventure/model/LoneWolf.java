package ByOrkblan.MyAdventure.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class LoneWolf extends Adventure {
    private int ability;
    private int endurance;
    private String weaponOne;
    private String weaponTwo;
    private String disciplineOne;
    private String disciplineTwo;
    private String disciplineThree;
    private String disciplineFor;
    private String disciplineFive;
    private String disciplineSix;
    private String moreDisciplineOne;
    private String moreDisciplineTwo;
    private String moreDisciplineThree;
    private String moreDisciplineFor;
    private String moreDisciplineFive;
    private String moreDisciplineSix;
}
