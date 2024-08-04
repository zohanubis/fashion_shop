package com.zohanubis.service;

import com.zohanubis.exception.UserException;
import com.zohanubis.model.User;


public interface UserService {
    public User findUserById(Long userId) throws UserException;

    public User findUserProfileByJwt(String jwt ) throws UserException;
}
