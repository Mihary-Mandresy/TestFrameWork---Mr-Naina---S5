package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;

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
    public String postSave(Map<String, List<MultpartFile>> multpart) {
        

        String path = "/home/mihary/Documents/Server/apache-tomcat-10.1.49/webapps/TestFrameWork/deployement";

        System.out.println("Save : ");

        File file = new File(path);
    

        if (file.exists()) {
            file.mkdir();

        }

        try {

            List<MultpartFile> list;
            File fl; FileOutputStream fileOutputStream = null;

            for (String key : multpart.keySet()) {
                list = multpart.get(key);

                System.out.println("Name :" + key);

                for (MultpartFile multpartFile : list) {

                    String filename = file.getAbsolutePath() + File.separator + multpartFile.getName() + "_" + System.currentTimeMillis() + "." + multpartFile.getExtension();

                    System.out.println(filename);

                    fl = new File(filename);

                    fl.createNewFile();

                    fileOutputStream = new FileOutputStream(fl);
                    fileOutputStream.write(multpartFile.getBytes());

                }
            }

            if (fileOutputStream != null) fileOutputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Save izy zany";
    }
}
