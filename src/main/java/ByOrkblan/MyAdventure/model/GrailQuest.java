package ByOrkblan.MyAdventure.model;

import jakarta.persistence.Entity;
import lombok.Data;


@Data
@Entity
public class GrailQuest extends Adventure{
private int lifeStart;
private int currentLife;
private int experience;
private int permanentLife;

}
