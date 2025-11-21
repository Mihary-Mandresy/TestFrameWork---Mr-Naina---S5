package app;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class App {
    public static void main(String[] args) {
        try {
            Class<?> cls = TestBaba.class;

            Method method = cls.getMethod("kaiza", String.class, String.class);
            Parameter[] parameters = method.getParameters();

            for(Parameter parameter : parameters) {
                System.out.println(parameter.getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
