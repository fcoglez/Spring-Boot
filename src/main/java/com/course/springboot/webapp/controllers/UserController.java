package com.course.springboot.webapp.controllers;

import com.course.springboot.webapp.models.User;
import com.course.springboot.webapp.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/profile")
    public Map<String, Object> detailsMap(){
        User user = new User("Francisco", "González");
        Map<String, Object> response = new HashMap<>();
        response.put( "user", user);

        return response;
    }


    //DTO
    @GetMapping("/profile/dto")
    public UserDto detailsDto(){
        User user = new User("Francisco", "González");
        UserDto userDto = new UserDto();

        userDto.setUser(user);
        userDto.setTitle("The title for user DTO");

        return userDto;
    }

    //Lista de usuarios
    @GetMapping("/profile/user/list")
    public List<User> userList(){
        User user1 = new User("Francisco", "González");
        User user2 = new User("Salvador", "Moyano");
        User user3 = new User("Adrian", "González");

        List<User> users = Arrays.asList(user1, user2, user3);

//        List<User> userList = new ArrayList<>();
//        userList.add(user1);
//        userList.add(user2);
//        userList.add(user3);

        return users;
    }





}
