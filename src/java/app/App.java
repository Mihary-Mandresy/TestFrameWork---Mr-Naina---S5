package app;

import java.lang.reflect.Array;
public class App {

    
    public static void main(String[] args) {
        try {
            // System.out.println(tab.getClass().getName() + " " + baba.getClass().getName());
            
            float[] baba = (float[]) getClass(float.class);
            for (Object o : baba) {
                System.out.println(o);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        private static Object getPrimitive(Class<?> cls) {
            Object value = null;
            if (cls.equals(float.class)) {
                value = new float[] {4, 6, 9};
                
            }
        
            return value;
        }

    @SuppressWarnings("unchecked")
    private static <T> Object getClass(Class<T> cls) {
        
        if (cls.isPrimitive()) {
            return getPrimitive(cls);
        }

        T[] t = (T[]) Array.newInstance(cls, 6);
        return t;
    }
}
