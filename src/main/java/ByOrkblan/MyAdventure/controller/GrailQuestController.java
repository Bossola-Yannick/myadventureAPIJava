package ByOrkblan.MyAdventure.controller;

import ByOrkblan.MyAdventure.service.GrailQuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grail-quest")
public class GrailQuestController {

    @Autowired
    private GrailQuestService grailQuestService;
}
