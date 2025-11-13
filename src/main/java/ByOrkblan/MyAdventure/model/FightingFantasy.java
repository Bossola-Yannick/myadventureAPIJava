package ByOrkblan.MyAdventure.model;

import jakarta.persistence.Entity;
import lombok.Data;


@Data
@Entity
public class FightingFantasy extends Adventure{
    private int startAbility;
    private int currentAbility;
    private int startEndurance;
    private int currentEndurance;
    private int startLuck;
    private int currentLuck;
    private int gold;
    private int jewels;
    private String potionName;
    private int potionDose;
    private int food;
}
