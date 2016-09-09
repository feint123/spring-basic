package com.feint.basic.service;

import com.feint.basic.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by feint on 16/9/9.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper mapper;
    public void addUser(String name,int age)
    {
        mapper.addUser(name, age);
    }
}
