package com.aerotravel.flightticketbooking.services;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    public abstract boolean loginUser(String username, String password);
}
