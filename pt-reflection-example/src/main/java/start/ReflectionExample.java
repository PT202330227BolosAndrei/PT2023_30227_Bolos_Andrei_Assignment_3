package start;

import java.lang.reflect.Field;
import java.util.List;

public class ReflectionExample {
    public static void retrieveColumnTitles(Object object) {
        System.out.println("\n=========================================");
        for (Field field : object.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            Object value;
            try {
                String format = "%1$-10s";
                value = field.get(object);
                System.out.format(format, field.getName());
            } catch (IllegalArgumentException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n-----------------------------------------");
    }

    public static void retrieveProperties(Object object) {

        for (Field field : object.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            Object value;
            try {
                String format = "%1$-10s";
                value = field.get(object);
                System.out.format(format, value);

            } catch (IllegalArgumentException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}



