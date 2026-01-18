package app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) throws Exception {
        String name = "dfd.dfdf.dfdf.immg";

        Pattern pattern = Pattern.compile("(?<filename>.+)\\.(?<ext>.+)");
        Matcher matcher = pattern.matcher(name);


        if (matcher.matches()) {
            System.out.println("eny");
            System.out.println(matcher.group("filename") + "    " + matcher.group("exts"));
        }

        // System.out.println(splt.length);

        // if (splt.length < 1) {
        //     System.out.println("vide");
        // } else {
        //     for (String string : splt) {
        //         System.out.println(string);
        //     }
        // }
    }
}
