package service;

import mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * Created by feint on 16/9/9.
 */
@Service
public class UserService {
    private UserMapper mapper;
    public void addUser(String name,int age)
    {
        mapper.addUser(name, age);
    }
}
