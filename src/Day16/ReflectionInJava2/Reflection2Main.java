package Day16.ReflectionInJava2;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Cat{
    public static  String displayContent(){

        return  ("Hey there, I am a Cat");
    }
    public static String canPerformTask(){
       return ("Hey there, I can Cat Walk");
    }
}



class Reflection2Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Class obj = cat.getClass();
        Method [] method = obj.getDeclaredMethods();
        for (Method m:method
             ) {
            System.out.println("Method Name:" + m.getName());

            int modifier = obj.getModifiers();
            String mod = Modifier.toString(modifier);
            System.out.println("Modifier Name: " + mod);

            Class returnType = m.getReturnType();
            System.out.println("Return type is: " + returnType);

        }



    }
}
