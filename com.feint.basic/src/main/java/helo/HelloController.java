package helo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by feint on 16/9/5.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "Greeting from spring boot";
    }
}
