package com.example.designpatterns.adaptor.security;

public interface UserDetailService {

    UserDetails loadUser(String userName);
}
