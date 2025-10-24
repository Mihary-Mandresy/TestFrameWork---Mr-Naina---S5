package app;

import java.lang.reflect.Method;

import com.mhframework.annotation.UrlMapping;

import controller.TestController;


public class App {
    public static void main(String[] args) {
        String path = "/bye";
        try {
            TestController testController = new TestController();
            Class<?> cls = testController.getClass();

            for (Method method : cls.getDeclaredMethods()) {
                UrlMapping urlMapping = method.getAnnotation(UrlMapping.class);
                if (urlMapping != null) {
                    String url = urlMapping.value();
                    if (url.equals(path)) {
                        method.invoke(testController);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
