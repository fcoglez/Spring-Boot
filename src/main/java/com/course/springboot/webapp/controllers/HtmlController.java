package com.course.springboot.webapp.controllers;

import com.course.springboot.webapp.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


@Controller
public class HtmlController {

    //para pasar datos a la vista con Model details en este caso
    @GetMapping("/details/model")
    public String details(Model model){
        model.addAttribute( "title","Hola mundo spring boot");
        model.addAttribute( "name","Francisco");
        model.addAttribute( "type","model");
        return "details";
    }

    //para pasar datos a la vista con Map details en este caso
    @GetMapping("/details/map")
    public String detailsMap(Map<String, String> model){
        model.put( "title","Hola mundo spring boot");
        model.put( "name","Francisco");
        model.put( "type","map");
        return "details";
    }

    //para pasar datos a la vista con el objeto User details en este caso
    @GetMapping("/detail")
    public String detailsUser(Map<String, Object> model){
        User user = new User("Francisco", "González");
        //user.setEmail("123@gmail.com");

        model.put( "title","Hola mundo spring boot");
        model.put( "user", user);

        return "details";
    }

    @GetMapping("list")
    public String userList(ModelMap model){
        model.addAttribute("title", "Lista de usuarios!");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> userList(){
        return Arrays.asList(
                new User("Maria", "Roman", "1234@gmail.com"),
                new User("Francisco", "Jiménez"),
                new User("Sergio", "Hontoria", "shglp@hotmail.com"),
                new User("Juan", "Galvez"));
    }
}
