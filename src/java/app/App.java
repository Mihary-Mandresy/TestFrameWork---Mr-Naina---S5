package app;

import com.fatboyindustrial.gsonjavatime.Converters;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mhframework.utils.JsonResult;

import dto.MatiereDto;

public class App {

    public static void main(String[] args) throws Exception {
        Gson gson = Converters.registerAll(new GsonBuilder()).create();

        JsonResult jsonResult = new JsonResult();

        MatiereDto[] matiereDtos = new MatiereDto[] {
            new MatiereDto("SVT", 6), 
            new MatiereDto("MATH", 10)
        };

        jsonResult.setData(matiereDtos);

        System.out.println(gson.toJson(jsonResult));
    }
}
