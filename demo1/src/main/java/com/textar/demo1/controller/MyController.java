package com.textar.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/my")
@Controller
public class MyController {
    @GetMapping("/no/annotation")
    @ResponseBody
    public Map<String,Object> noAnnotation(
            Integer intVal,Long longVal,String str){
        Map<String ,Object>paramsMap=new HashMap<>();
        paramsMap.put("intVal",longVal);
        paramsMap.put("longVal",longVal);
        paramsMap.put("str",str);
        return paramsMap;
    }
}
