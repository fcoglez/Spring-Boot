package com.course.springboot.webapp.controllers;

import com.course.springboot.webapp.models.User;
import com.course.springboot.webapp.models.dto.ParamsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/var")
public class PathVariableController {

    @Value("${config.name}")
    private String name;

    @Value("${config.surname}")
    private String surname;

    @Value("${config.message}")
    private String message;

    @Value("#{ ${config.valuesMap} }")
    private Map<String, Object> valuesMap;

    @Value("#{ ${config.valuesMap}.product }")
    private String productName;

    @Autowired
    private Environment environment;

    @GetMapping("baz/{message}")
    public ParamsDto baz(@PathVariable String message){
        ParamsDto param = new ParamsDto();
        param.setMessage(message);
        return param;
    }

    @GetMapping("mix/{message}/{id}")
    public ParamsDto mix(@PathVariable String message, @PathVariable Integer id){
        ParamsDto param = new ParamsDto();
        param.setMessage(message);
        param.setId(id);
        return param;
    }

    @PostMapping("create")
    public User create(@RequestBody  User user){
        return user;
    }

    @GetMapping("/values")
    public Map<String, Object> values( @Value("${config.age}") String age){
        Map<String, Object> json = new HashMap<>();
        json.put("name", name);
        json.put("surname", surname);
        json.put("age", Integer.parseInt(age));
        json.put("age2", environment.getProperty("config.age", Integer.class));
        json.put("message", message);
        json.put("message2", environment.getProperty("config.message"));
        json.put("valuesMap", valuesMap);
        json.put("productName", productName);

        return json;
    }



}
