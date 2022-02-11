package Day16.ReflectionFields;

import java.lang.reflect.Field;

class Dog{
    public String type;
}


public class Main {
    public static void main(String[] args) {
      try{
          Dog dog = new Dog();
          Class obj = dog.getClass();
          Field field1 = obj.getField("type");
          field1.set(dog, "Lucky");
          String typeValue = (String) field1.get(dog);
          System.out.println("Value: " + typeValue);
      }
      catch(Exception e){
          e.printStackTrace();
      }
    }
}
