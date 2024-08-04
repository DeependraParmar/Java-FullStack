package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        // Reflection
        Class<Student> cls1 = Student.class;
        Class<Student> cls2 = Student.class;

        System.out.println("********** GETTING MEMBERS ************");
        // getting all the fields of any class via reflection
        Field[] fields = cls1.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field.getName() + ": " + field.getType());
        }

        System.out.println();
        System.out.println("********** GETTING METHODS ************");

        // getting all the methods of any class via reflection
        Method[] methods = cls1.getDeclaredMethods();
        for(Method method : methods){
            System.out.println(method.getName() + ": " + method.getReturnType() + " " + method.getParameterCount());
        }

        // getting the constructor and initialising the object
        try {
            Constructor<Student> constructor = cls1.getConstructor(int.class, String.class, float.class);
            try {
                Student s = constructor.newInstance(56, "Deependra Parmar", 87.7f);
                s.show();
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}

/*
    1. Reflections can be used to get data members(name, type) and methods(name,
        parameters, return type) of any pre-defined or user-defined class.
    2. It can also be used to get constructors or individual constructor.
    3. It can also be used to initialize new objects via fetched constructors.
    4. It can also be used to access private data members and methods by changing
        accessibility of the members and then invoking the methods.
    5. Similarly, hibernate sees the annotations and through this, it identifies
        the primary key, column name, etc. and reads all of them via reflections.
 */