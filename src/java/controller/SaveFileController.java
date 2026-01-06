package controller;

import com.mhframework.annotation.ParamRequest;
import com.mhframework.annotation.classes.Controller;
import com.mhframework.annotation.method.GetMapping;
import com.mhframework.annotation.method.PostMapping;
import com.mhframework.handler.controller.MultpartFile;
import com.mhframework.handler.view.ModelView;

@Controller
public class SaveFileController {
    
    @GetMapping("/save")
    public ModelView viewSaveForm() {
        return new ModelView("save.jsp");
    }

    @PostMapping("/save")
    public String postSave(@ParamRequest("file") MultpartFile multpartFile) {

        System.out.println(multpartFile.getPart().getSubmittedFileName());

        return "Save izy zany";
    }
}
