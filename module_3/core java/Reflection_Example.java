import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class Student {

    public void display() {

        System.out.println(
            "Student Method Called"
        );
    }

    public void greet(String name) {

        System.out.println(
            "Hello " + name
        );
    }
}

public class Reflection_Example {

    public static void main(String[] args) {

        try {

            // Load Class Dynamically
            Class<?> cls =
            Class.forName("Student");

            // Create Object Dynamically
            Object obj =
            cls.getDeclaredConstructor()
               .newInstance();

            // Get All Methods
            Method[] methods =
            cls.getDeclaredMethods();

            // Print Method Names
            System.out.println(
                "Methods in Student class:"
            );

            for (Method method : methods) {

                System.out.println(
                    "\nMethod Name: " +
                    method.getName()
                );

                // Print Parameters
                Parameter[] params =
                method.getParameters();

                for (Parameter param : params) {

                    System.out.println(
                        "Parameter: " +
                        param.getType().getName()
                    );
                }
            }

            // Invoke display()
            Method displayMethod =
            cls.getDeclaredMethod(
                "display"
            );

            displayMethod.invoke(obj);

            // Invoke greet(String)
            Method greetMethod =
            cls.getDeclaredMethod(
                "greet",
                String.class
            );

            greetMethod.invoke(
                obj,
                "Abhinav"
            );

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}