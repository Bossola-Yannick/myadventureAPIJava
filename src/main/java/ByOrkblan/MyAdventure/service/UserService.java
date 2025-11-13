package ByOrkblan.MyAdventure.service;

import ByOrkblan.MyAdventure.model.User;
import ByOrkblan.MyAdventure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }
}
