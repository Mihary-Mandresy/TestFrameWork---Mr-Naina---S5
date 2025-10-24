package app;

import java.util.List;

import com.mhframework.annotation.classes.ClassMapping;

import utils.PackageScanner;

public class App {
    public static void main(String[] args) {

        try {
            String packageName = "TestClassMapping";
            List<Class<?>> classes = PackageScanner.getClasses(packageName);

            System.out.println("Les classes qui avait l'annotation : ");

            for (Class<?> cls : classes) {
                ClassMapping classMapping = cls.getAnnotation(ClassMapping.class);
                if (classMapping == null) {
                    continue;
                }

                System.out.println(cls.getSimpleName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
