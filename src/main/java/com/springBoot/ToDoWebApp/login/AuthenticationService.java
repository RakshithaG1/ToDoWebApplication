package com.springBoot.ToDoWebApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticateUser(String userName, String password) {
        boolean isValidUserName = userName.equalsIgnoreCase("RakshithaG");
        boolean isValidPassword = password.equalsIgnoreCase("Malakhed");

        return isValidUserName && isValidPassword ;
    }
}
