package Day6;

import java.util.logging.Logger;
/*Interfaces are same like abstraction but the difference is that interface uses implements instead of using extends*/
public class InterfaceInJava {
public static  void main(String []args){
    MyInterface myInterface = new MyInterface();
    myInterface.myMethod1();
    myInterface.myMethod2();
}

}

interface  JavaInterface1{
    void myMethod1();
}
interface JavaInterface2{
    void myMethod2();
}

class MyInterface implements JavaInterface1,JavaInterface2{

    @Override
    public void myMethod1() {
        Logger.getGlobal().info("My Method 1");
    }

    @Override
    public void myMethod2() {
        Logger.getGlobal().info("My method is 2");
    }
}