package com.example.designpatterns.adaptor;

import com.example.designpatterns.adaptor.security.LoginHandler;
import com.example.designpatterns.adaptor.security.UserDetailService;
import com.example.designpatterns.adaptor.step1.AccountUserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailService userDetailService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailService);

        String login = loginHandler.login("taekwan", "ddd");
        System.out.println("login = " + login);
    }
}
