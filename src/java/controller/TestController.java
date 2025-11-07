package controller;

import com.mhframework.annotation.UrlMapping;
import com.mhframework.annotation.classes.Controller;

@Controller
public class TestController {
    
    @UrlMapping("/hello")
    public void hello() {
        System.out.println("Hello");
    }

    @UrlMapping("/bye")
    public void bye() {
        System.out.println("Bye");
    }
}
