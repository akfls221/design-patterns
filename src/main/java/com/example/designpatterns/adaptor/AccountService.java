package com.example.designpatterns.adaptor;

public class AccountService {

    public Account findAccountByUserName(String userName) {
        Account account = new Account();
        account.setName(userName);
        account.setPassword(userName);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }
}
