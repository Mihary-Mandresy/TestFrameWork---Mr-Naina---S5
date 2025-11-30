package controller;

import com.mhframework.annotation.ParamRequest;
import com.mhframework.annotation.classes.Controller;
import com.mhframework.annotation.method.GetMapping;
import com.mhframework.annotation.method.PostMapping;
import com.mhframework.handler.view.ModelView;

@Controller
public class TestController {

    @GetMapping("/hello")
    public String hello(String langue, String nom, @ParamRequest("kidoro") int taona) {
        System.out.println("Langue : " + langue + " , Nom = " + nom + " , Age : " + taona);
        return "Hello jiaby";
    }

    @GetMapping("/bye")
    public ModelView bye() {
        ModelView modelView = new ModelView("baba.jsp");

        String[] couleur = { "rouge", "vert", "blue" };
        modelView.addData("couleur", couleur);

        return modelView;
    }

    @GetMapping("/semestres/{id}/etudiants/{idSemestre}/{nom}")
    public String mapKely(int id, int idSemestre, String nom) {
        System.out.println("idSemestre : " + idSemestre + ", id : " + id + ", nom : " + nom);
        return "Map kely oh";
    }

    @GetMapping("/test")
    public String itoGet(String nom) {
        System.out.println("zany ny Nom : " + nom);
        return "Zany ny Get";
    }

    @PostMapping("/test")
    public String itoPost(String nom) {
        System.out.println("zany ny Nom : " + nom);
        return "Zany ny post";
    }
}
