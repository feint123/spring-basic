package web;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

/**
 * Created by feint on 16/9/9.
 */
@RestController
public class UserController {
    @Autowired
    UserService service;

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = "application/json")
    void addUser(@PathVariable("user") User user){
        service.addUser(user.getName(),user.getAge());
    }

}
