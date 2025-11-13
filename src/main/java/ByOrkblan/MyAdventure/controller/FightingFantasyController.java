package ByOrkblan.MyAdventure.controller;

import ByOrkblan.MyAdventure.model.Adventure;
import ByOrkblan.MyAdventure.model.FightingFantasy;
import ByOrkblan.MyAdventure.service.FightingFantasyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fighting-fantasy")
public class FightingFantasyController {

    @Autowired
    private FightingFantasyService fightingFantasyService;

    // Insertion d'une aventure
    @PostMapping("/add")
    public FightingFantasy saveAdventureFightingFantasy(@RequestBody FightingFantasy fightingFantasy){
        return fightingFantasyService.saveAdventureFightingFantasy(fightingFantasy);
    }

    // Recupération d'aventure par son Id
    @GetMapping
    public ResponseEntity<Adventure> getAdventureById(@RequestParam(name="idAdventure") Integer id){
        FightingFantasy adventure = fightingFantasyService.findAdventureById(id);
        return ResponseEntity.ok(adventure);
    }

}
