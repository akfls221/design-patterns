package com.example.designpatterns.adaptor.security;

public class LoginHandler {
    UserDetailService userDetailService;

    public LoginHandler(UserDetailService userDetailService) {
        this.userDetailService = userDetailService;
    }

    public String login(String userName, String password) {
        UserDetails userDetails = userDetailService.loadUser(userName);
        if (userDetails.getPassword().equals(password)) {
            return userDetails.getUserName();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
