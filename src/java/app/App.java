package app;

import utils.PackageScanner;

public class App {
    public static void main(String[] args) {

        try {
            String packageName = "TestClassMapping";

            PackageScanner packageScanner = new PackageScanner(packageName);

            packageScanner.getClassAnnote().forEach(e -> System.out.println(e.getSimpleName()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
