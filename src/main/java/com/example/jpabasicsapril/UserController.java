package com.example.jpabasicsapril;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add-User")                                                      // 1st API
    public String addUser(@RequestBody User user) {

        return userService.addUser(user);
    }

    @GetMapping("/get-Users")                                                      // 2nd API
    public List<User> getUser(){

        return userService.getUsers();
    }

    @GetMapping("/get-User")                                                       // 3rd API
    public User getUser(@RequestParam int id){

        return userService.getUser(id);
    }


    // ----------------------------------------------------------------------------------------

                        // Homework (10/04/2023) :
                        // 1. Delete all the users.
                        // 2. Delete a user by userId.
                        // 3. Update the name of a user with a particular userId.

    // -----------------------------------------------------------------------------------------

    @DeleteMapping("/delete-All-Users")                                            // 4th API
    public String deleteAllUsers(){

        userService.deleteAllUsers();
        return "Delete all users successfully";
    }

    @DeleteMapping("/delete-By-Id")                                                // 5th API
    public String deleteById(@RequestParam int id){

        userService.deleteById(id);
        return " Delete id successfully";
    }

    @PutMapping("/updateName-Of-UserId")                                           // 6th API
    public String updateNameOfUserId(@RequestParam int id,@RequestParam String name){

        userService.updateNameOfUserId(id,name);
        return "Id Name update successfully";
    }


}
