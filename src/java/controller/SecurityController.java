package controller;

import java.util.Map;

import com.mhframework.annotation.classes.Controller;
import com.mhframework.annotation.method.GetMapping;
import com.mhframework.annotation.method.PostMapping;
import com.mhframework.annotation.method.security.Role;
import com.mhframework.annotation.param.Session;
import com.mhframework.handler.view.ModelView;

@Controller
public class SecurityController {

    @GetMapping("/bakokely")
    public ModelView login() {
        return new ModelView("security/login.jsp");
    }

    @PostMapping("/bakokely")
    public ModelView testLogin(String name, String mdp, @Session Map<String, Object> session) {

        if (name.equals("mihary") && mdp.equals("mandresy")) {
            session.put("auth", "");
            session.put("role", "admin");
        }

        return new ModelView("security/login.jsp");
    }

    @GetMapping("/home")
    @Role("admin")
    public ModelView home() {
        return new ModelView("security/home.jsp");
    }
    
}
