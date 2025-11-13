package ByOrkblan.MyAdventure.controller;

import ByOrkblan.MyAdventure.model.User;
import ByOrkblan.MyAdventure.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping
    public ResponseEntity<User> getUserById(@RequestParam(name="idUser") Integer id){
        User user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping
    public void deleteUserById(@RequestParam(name="idUser")Integer id){
        userService.deleteUser(id);
    }
}
