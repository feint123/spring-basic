package com.feint.basic.web;

import com.feint.basic.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.feint.basic.service.UserService;

/**
 * Created by feint on 16/9/9.
 */
@RestController
public class UserController {
    @Autowired
    UserService service;

    @RequestMapping(value = "/user/{name}/{age}", method = RequestMethod.GET, produces = "application/json")
    void addUser(@PathVariable("name") String name,@PathVariable("age")int age){
        service.addUser(name,age);
    }

}
