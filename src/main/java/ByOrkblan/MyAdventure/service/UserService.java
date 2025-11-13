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

    public User getUserById(Integer id){
        User user = userRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("User not found !"));
        return user;
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
