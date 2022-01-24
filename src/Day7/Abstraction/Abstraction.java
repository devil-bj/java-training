package Day7.Abstraction;

import java.util.logging.Logger;
/*Abstraction is the process of hiding complex ideas and working mechanism from the user
* basically, non access modifier abstract  is  used for abstraction
* abstract class is a restricted class that does not allow objects to be created.It can be accessed by other inherited class.
* abstract method can only be used in abstract class which do not have a  body. It can be accessed by inherited class.  */
class Abstraction {
   public static void main(String []args){
       Abstraction2 abs = new Abstraction2();
       abs.method();
       abs.function();
   }
}
abstract class Abstraction1 {
    String name = " Jak Bauer";
    abstract void method();
    public void function (){
        Logger.getGlobal().info("Hey there.");
    }
}

class Abstraction2 extends Abstraction1{
String address = "Irving Texas";
    void method() {
        Logger.getGlobal().info("Name:" + name + "Address: " + address);
    }
}
