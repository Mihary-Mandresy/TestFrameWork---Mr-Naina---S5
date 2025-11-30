package controller;

import java.util.Map;

import com.mhframework.annotation.classes.Controller;
import com.mhframework.annotation.method.PostMapping;

@Controller
public class MapTestController {
    
    @PostMapping("/maptest")
    public String testMapEh(Map<String, Object> map) {
        map.forEach((key, value) -> {
            System.out.println("Key : " + key + ", " + "Value : " + value);
        });
        return "Test Mapy oh";
    }
}
