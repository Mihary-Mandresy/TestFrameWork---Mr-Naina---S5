package controller;

import com.mhframework.annotation.UrlMapping;
import com.mhframework.annotation.classes.Controller;

@Controller
public class TestController {
    
    @UrlMapping("/hello")
    public String hello() {
        return "Hello jiaby";
    }

    @UrlMapping("/bye")
    public String bye() {
        return "Bye jiaby";
    }
}
