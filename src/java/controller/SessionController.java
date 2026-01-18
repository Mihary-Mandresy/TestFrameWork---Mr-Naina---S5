package controller;

import java.util.Map;

import com.mhframework.annotation.classes.Controller;
import com.mhframework.annotation.method.GetMapping;
import com.mhframework.annotation.method.PostMapping;
import com.mhframework.annotation.param.Session;
import com.mhframework.handler.view.ModelView;

@Controller
public class SessionController {
    
    @GetMapping("/session")
    public ModelView session() {
        return new ModelView("session.jsp");
    }

    @PostMapping("/session")
    public String postKely(@Session Map<String, Object> session, String sess) {
        session.put("sess", sess);

        System.out.println("baba kosa eh");

        return "zay";
    }

    @GetMapping("/sessiontest")
    public ModelView testSession() {
        return new ModelView("sessionTest.jsp");
    }
}
