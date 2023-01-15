package com.example.designpatterns.adaptor.step1;

import com.example.designpatterns.adaptor.Account;
import com.example.designpatterns.adaptor.security.UserDetails;

public class AccountUserDetails implements UserDetails {

    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUserName() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}
