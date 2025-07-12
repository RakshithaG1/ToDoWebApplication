package com.springBoot.ToDoWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    //http://localhost:8080/login?name=Rakshitha
    //Model Map
    @RequestMapping("login")
    public String goToLogin(@RequestParam String name, ModelMap model) {
        logger.debug("Request Param is {}", name);
        logger.info("I want this to be printed at INFO Level {}", name);
        model.put("name", name);
        return "login";
    }
}

