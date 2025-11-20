package controller;

import com.mhframework.annotation.UrlMapping;
import com.mhframework.annotation.classes.Controller;
import com.mhframework.handler.view.ModelView;

@Controller
public class TestController {

    @UrlMapping("/hello")
    public String hello() {
        return "Hello jiaby";
    }

    @UrlMapping("/bye")
    public ModelView bye() {
        ModelView modelView = new ModelView("baba.jsp");

        String[] couleur = { "rouge", "vert", "blue" };
        modelView.addData("couleur", couleur);

        return modelView;
    }
}
