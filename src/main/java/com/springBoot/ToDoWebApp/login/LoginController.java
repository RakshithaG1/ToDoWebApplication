package com.springBoot.ToDoWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    //http://localhost:8080/login?name=Rakshitha
    @RequestMapping("login")
    public String goToLogin(@RequestParam String name) {
        System.out.println("Request Param is ="+name);
        return "login";
    }
}

