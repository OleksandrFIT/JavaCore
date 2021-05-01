package JC_hm16;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Object example = new ClassExample();
        Class clazz = example.getClass();

        Method [] methods = clazz.getDeclaredMethods();
        for (Method m : methods){
            System.out.println(m.getName());
        }


        System.out.println("\n=============\nFields");
        Class clazz2 = example.getClass();
        Field [] fields = clazz2.getDeclaredFields();
        for (Field f: fields){
            System.out.println(f.getName());
        }

        System.out.println("\n=============\nConstructors");
        Class clazz3 = example.getClass();
        Constructor [] constructors = clazz3.getDeclaredConstructors();
        for (Constructor c: constructors){
            System.out.println(c.getName());
        }

        System.out.println("\n=============\nMethods");
        Method[] sampleMethods = SampleClass.class.getMethods();
        SampleClass sampleObject = new SampleClass();
        sampleMethods[1].invoke(sampleObject, "data");
        System.out.println(sampleMethods[0].invoke(sampleObject));


    }

}
