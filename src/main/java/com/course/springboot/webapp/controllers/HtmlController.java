package com.course.springboot.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
    public String details(Map<String, String> model){
        model.put( "title","Hola mundo spring boot");
        model.put( "name","Francisco");
        model.put( "type","map");
        return "details";
    }
}
