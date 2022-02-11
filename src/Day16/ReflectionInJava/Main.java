package Day16.ReflectionInJava;

import java.lang.reflect.Modifier;

class Animal {
    void animalSound(){};
}

class Dog extends Animal{
    void dogSound(){
        System.out.println("Barks when Stranger try to enter his territory");
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            Dog d1 = new Dog();
            Class obj = d1.getClass();

            String name = obj.getName();
            System.out.println("Name Of the Class:" + name);

            int modifier = obj.getModifiers();
            String mod = Modifier.toString(modifier);
            System.out.println("Name of modifier:" + mod);

            Class superClass = obj.getSuperclass();
            System.out.println("Super Class Name: " + superClass);
        }
        catch(Exception e){
            e.printStackTrace();
        }



    }
}
