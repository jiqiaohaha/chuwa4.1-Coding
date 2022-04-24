package chuwa.myFirstSpring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {
    @RequestMapping("/penelope")
    public String getMessage(){
        return "Hello World!";
    }
}
