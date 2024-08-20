package com.course.springboot.webapp.controllers;

import com.course.springboot.webapp.models.dto.ParamsDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {


    //Si no ponemos el required, por defecto es true
    @GetMapping("/foo")
    public ParamsDto foo(@RequestParam(required = false, defaultValue = "Hola")  String message){
        ParamsDto param = new ParamsDto();
        param.setMessage(message);

        if (param.getId() == null){
            param.setId(0);
        }

        return param;
    }

    @GetMapping("/bar")
    public ParamsDto bar(@RequestParam() String message, @RequestParam() Integer id){
        ParamsDto params = new ParamsDto();
        params.setMessage(message);
        params.setId(id);

        return params;
    }



    @GetMapping("/fco")
    public ParamsDto fco(HttpServletRequest request){
        int code = 0;

        try {
            code = Integer.parseInt(request.getParameter("id"));
        } catch (NumberFormatException _) {

        }

        ParamsDto params = new ParamsDto();
        params.setMessage(request.getParameter("message"));
        params.setId(code);

        return params;
    }

}
