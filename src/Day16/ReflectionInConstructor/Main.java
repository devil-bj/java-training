package Day16.ReflectionInConstructor;

import javax.security.auth.login.Configuration;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

class Rabbit{
    public Rabbit() // creating a constructor without parameter.
    {}
    private Rabbit(int age){}  // creating constructor with parameter.
}



public class Main {
    public static void main(String[] args){
        try{
            Rabbit r1 = new Rabbit();
            Class obj = r1.getClass();
            Constructor[] constructor = obj.getDeclaredConstructors();
            for (Constructor c1:constructor
                 ) {
                System.out.println("Constructor Name is: " + c1);
                int modifier = c1.getModifiers();
                String mod = Modifier.toString(modifier);
                System.out.println("Modifier Name is: " + mod);

                int param = c1.getParameterCount();
                System.out.println(" Parameter Count is : " + param );
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
