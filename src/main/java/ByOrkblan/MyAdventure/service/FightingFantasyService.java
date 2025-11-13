package ByOrkblan.MyAdventure.service;

import ByOrkblan.MyAdventure.model.Adventure;
import ByOrkblan.MyAdventure.model.Bag;
import ByOrkblan.MyAdventure.model.FightingFantasy;
import ByOrkblan.MyAdventure.model.Note;
import ByOrkblan.MyAdventure.repository.FightingFantasyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FightingFantasyService {

    @Autowired
    private FightingFantasyRepository fightingFantasyRepository;

    //create
    public FightingFantasy saveAdventureFightingFantasy(FightingFantasy fightingFantasy) {
        if (fightingFantasy.getUser()!=null){
            fightingFantasy.getUser().getAdventures().add(fightingFantasy);
        }
        if (fightingFantasy.getNotes() != null){
            List<Note> notes = new ArrayList<>(fightingFantasy.getNotes());
            fightingFantasy.getNotes().clear();
            notes.forEach(fightingFantasy::addNote);
        }
        if(fightingFantasy.getItemBag() != null){
            List<Bag> bags = new ArrayList<>(fightingFantasy.getItemBag());
            fightingFantasy.getItemBag().clear();
            bags.forEach(fightingFantasy::addBag);
        }
        return fightingFantasyRepository.save(fightingFantasy);
    }
    //update

    //getOneById
    public FightingFantasy findAdventureById(Integer id) {
        FightingFantasy adventure = fightingFantasyRepository.findById(id).orElseThrow(()->new IllegalArgumentException("This adventure not exist!"));
        return adventure;
    }
    //getAll

    //delete
}
