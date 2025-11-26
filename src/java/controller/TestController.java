package controller;

import com.mhframework.annotation.ParamRequest;
import com.mhframework.annotation.UrlMapping;
import com.mhframework.annotation.classes.Controller;
import com.mhframework.handler.view.ModelView;

@Controller
public class TestController {

    @UrlMapping("/hello")
    public String hello(String langue, String nom, @ParamRequest("kidoro") int taona) {
        System.out.println("Langue : " + langue + " , Nom = " + nom + " , Age : " + taona);
        return "Hello jiaby";
    }

    @UrlMapping("/bye")
    public ModelView bye() {
        ModelView modelView = new ModelView("baba.jsp");

        String[] couleur = { "rouge", "vert", "blue" };
        modelView.addData("couleur", couleur);

        return modelView;
    }

    @UrlMapping("/semestres/{id}/etudiants/{idsemestre}/{nom}")
    public String mapKely(int id, int idSemestre, String nom) {
        System.out.println("idSemestre : " + idSemestre + ", id : " + id + ", nom : " + nom);
        return "Map kely oh";
    }
}
