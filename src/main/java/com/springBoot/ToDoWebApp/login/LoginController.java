package com.springBoot.ToDoWebApp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@SessionAttributes("name")
public class LoginController {

    @Autowired
    private AuthenticationService authenticationService;

    private Logger logger = LoggerFactory.getLogger(getClass());

    //http://localhost:8080/login?name=Rakshitha
    //Model Map
//    @RequestMapping("login")
//    public String goToLogin(@RequestParam String name, ModelMap model) {
//        logger.debug("Request Param is {}", name);
//        logger.info("I want this to be printed at INFO Level {}", name);
//        model.put("name", name);
//        return "login";
//    }

    @RequestMapping(value="login", method = RequestMethod.GET)
    public String goToLogin() {
            return "login";
        }

    @RequestMapping(value="login", method = RequestMethod.POST)
    public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

        if(authenticationService.authenticateUser(name, password)) {
            model.put("name", name);
            //Authentication
            //Rakshitha, Malakhed1#

            return "welcome";
        }
        else
        {
            return "login";
        }
    }
}

