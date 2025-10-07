package ByOrkblan.MyAdventure.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/myadventure")
public class TestCo {
    @GetMapping("/test")
    public String test(){
        return "hello";
    }
}
