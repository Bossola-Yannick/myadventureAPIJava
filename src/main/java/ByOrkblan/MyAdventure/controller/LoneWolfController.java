package ByOrkblan.MyAdventure.controller;

import ByOrkblan.MyAdventure.service.LoneWolfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lone-wolf")
public class LoneWolfController {
    @Autowired
    private LoneWolfService loneWolfService;
}
