package com.course.springboot.webapp.controllers;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/api")
public class JsonController {

//    @GetMapping("/details")
//    public Map<String, Object> details(){
//        Map<String, Object> response = new HashMap<>();
//        response.put( "title","Hola mundo spring boot");
//        response.put( "name","Francisco");
//        response.put( "surname", "González");
//
//        return response;
//    }

    @RequestMapping(path = "/details", method = RequestMethod.GET)
    public Map<String, Object> details(){
        Map<String, Object> response = new HashMap<>();
        response.put( "title","Hola mundo spring boot");
        response.put( "name","Francisco");
        response.put( "surname", "González");

        return response;
    }


}
