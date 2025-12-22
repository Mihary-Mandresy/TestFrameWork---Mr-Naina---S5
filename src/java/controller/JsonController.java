package controller;

import com.mhframework.annotation.classes.Controller;
import com.mhframework.annotation.method.GetMapping;
import com.mhframework.annotation.method.JsonApi;

import dto.MatiereDto;

@Controller
public class JsonController {

    @JsonApi
    @GetMapping("/json")
    public MatiereDto[] getPersonneDtos() {
         MatiereDto[] matiereDtos = new MatiereDto[] {
            new MatiereDto("SVT", 6),
            new MatiereDto("MATH", 10)
        };
        return matiereDtos;
    }

    @GetMapping("/babakely")
    public String babakely() {
        System.out.println("ato amin'ny babakely");
        return "Babakely";
    }
    
}
