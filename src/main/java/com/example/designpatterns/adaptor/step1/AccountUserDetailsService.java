package com.example.designpatterns.adaptor.step1;

import com.example.designpatterns.adaptor.Account;
import com.example.designpatterns.adaptor.AccountService;
import com.example.designpatterns.adaptor.security.UserDetailService;
import com.example.designpatterns.adaptor.security.UserDetails;

public class AccountUserDetailsService implements UserDetailService {

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String userName) {
        Account account = accountService.findAccountByUserName(userName);
        return new AccountUserDetails(account);
    }
}
