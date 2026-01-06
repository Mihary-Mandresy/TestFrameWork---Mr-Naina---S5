package controller;

import java.io.File;

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
    public String postSave(@ParamRequest("file") MultpartFile[] multpartFile, MultpartFile fileKely) {

        String path = "/home/mihary/Documents/Server/apache-tomcat-10.1.49/webapps/TestFrameWork/deployement";

        System.out.println("Save : ");

        File file = new File(path);

        if (file.exists()) {
            file.mkdir();
        }

        try {
            for (int a = 0; a < multpartFile.length; a++) {
                multpartFile[a].save(path);
                System.out.println("Save avec succes : index " + (a + 1));
            }

            fileKely.save(path);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Save izy zany";
    }
}
