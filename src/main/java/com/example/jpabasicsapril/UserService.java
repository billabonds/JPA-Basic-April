package com.example.jpabasicsapril;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String addUser(User user) {

        userRepository.save(user);
        return "User added successfully";
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUser(int id){
        return userRepository.findById(id).get();
    }

    public void deleteAllUsers(){
        userRepository.deleteAll();
    }

    public void deleteById(int id){
        userRepository.deleteById(id);
    }

    public void updateNameOfUserId(int id,String name){
        userRepository.findById(id).get().setName(name);
    }
}
