package controller;

import java.util.Map;

import com.mhframework.annotation.classes.Controller;
import com.mhframework.annotation.method.GetMapping;
import com.mhframework.annotation.method.PostMapping;
import com.mhframework.handler.view.ModelView;

import dto.PersonneDto;

@Controller
public class MapTestController {
    
    @PostMapping("/maptest")
    public String testMapEh(Map<String, Object> map) {
        map.forEach((key, value) -> {
            System.out.println("Key : " + key + ", " + "Value : " + value);
        });
        return "Test Mapy oh";
    }

    @GetMapping("/dto")
    public ModelView pageDTO() {
        return new ModelView("dto.jsp");
    }

    @PostMapping("/dto")
    public String testDTO(PersonneDto personneDto) {

        System.out.println(personneDto);

        return "Test DTO Oh";
    }
}
