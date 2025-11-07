package app;

import java.util.List;

// import utils.PackageScanner;

public class App {
    public static void main(String[] args) {
        try {
            String pkg = "app";

            PackageScanner packageScanner = new PackageScanner(pkg);

            List<Class<?>> classes = packageScanner.getProjectClasses();

            classes.stream()
                    .forEach(e -> System.out.println(e.getName()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
