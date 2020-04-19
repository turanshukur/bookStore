package com.turanshukur.bookstore.service;

import com.turanshukur.bookstore.model.User;
import com.turanshukur.bookstore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public void createUser(User user) {
        userRepository.save(user);
    }


    public User deleteUser(Long id) {
       User user = userRepository.getOne(id);
       userRepository.deleteById(id);
       return user;
    }
}
