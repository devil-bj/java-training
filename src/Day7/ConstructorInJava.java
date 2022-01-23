package Day7;

import java.util.logging.Logger;

public class ConstructorInJava { // this is the example of constructor of java programming.
    public static void main(String []args){
        Constructor constructor =new Constructor("Bijay Pokhrel", 68,"Texas United States");
        Logger.getGlobal().info("NAME OF PERSON: " + constructor.name  + "ADDRESS :" + constructor.address + "Age of Person:" + constructor.age);
    }
}

