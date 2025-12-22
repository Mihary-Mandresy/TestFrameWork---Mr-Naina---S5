package app;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dto.PersonneDto;

public class App {

    static Pattern pattern = Pattern.compile("^\\[(\\d)\\].*");

    public static void main(String[] args) throws Exception {

        // Float[][][][] baba = new Float[10][][][];

        // List<String> all = List.of("p[0].note[0][1]",
        //         "p[0].note[0][3]",
        //         "p[0].note[0][5]", "p[1].nom", "p[2].age");

        // System.out.println(dimension(baba.getClass()));
        // System.out.println(baba.getClass().getComponentType());
        // System.out.println(lengthTab(all, "p"));

        PersonneDto[] personneDtos = new PersonneDto[4];

        System.out.println(personneDtos.getClass());
    }

    public static int lengthTab(List<String> all, String varialbleName) throws Exception {
        List<String> filtre = all
                .stream()
                .filter(e -> e.startsWith(varialbleName))
                .toList();
        if (filtre.size() <= 0) {
            throw new Exception("Il n'y a pas de tableau pour le parametre : " + varialbleName);
        }
        int max = 0;
        boolean check = false;
        Matcher matcher = null;
        for (String str : filtre) {
            String replStr = str.replace(varialbleName, "");
            matcher = pattern.matcher(replStr);
            if (matcher.matches()) {
                check = true;
                int value = Integer.parseInt(matcher.group(1));
                if (value > max) {
                    max = value;
                }
            } else {
                throw new Exception("Peut etre que ce n'est pas une tableau : " + str);
            }
            
        }

        return check ? max + 1 : max;
    }

    public static int dimension(Class<?> cls) throws Exception {
        String name = cls.getName();
        int cpt = 0;
        for (char c : name.toCharArray()) {
            if (c == '[') {
                cpt++;
            }
        }
        return cpt;
    }
}
