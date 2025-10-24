package controller;

import com.mhframework.annotation.UrlMapping;

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
