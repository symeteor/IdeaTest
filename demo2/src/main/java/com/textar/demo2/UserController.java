package com.textar.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    private List<User> userList = new ArrayList<>();
    {
        userList.add(new User("1","socks","123456", new Date()));
        userList.add(new User("2", "admin", "111111", new Date()));
        userList.add(new User("3", "jacks", "222222", null));
    }
    private List<Article> aList = new ArrayList<>();
    {
        aList.add(new Article("11","新浪星闻socks","1299-2-13"));
        aList.add(new Article("211","2新浪星闻socks","1399-2-13"));
    }
    @GetMapping("/test")
    public ModelAndView index() {
        return new ModelAndView("user/user", "userList", userList);
    }
    @GetMapping("/test2")
    public ModelAndView index2() {
        return new ModelAndView("article/index", "articles", aList);
    }
}



