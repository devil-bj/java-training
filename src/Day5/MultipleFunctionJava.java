package Day5;

import java.util.logging.Logger;

public class MultipleFunctionJava {

 public static void main(String[] args){
    eat();
    speak("Ram Can speak.");
    action();
    drive(12344);
    }

    static void eat() {
      Logger.getGlobal().info("This belongs to eat function");
    }
    static void speak(String name){
        Logger.getGlobal().info("This belongs to speak function" +name);

    }
    static void action(){
        Logger.getGlobal().info("This belongs to do some work action-function");

    }
    static void drive(int abc){
        Logger.getGlobal().info("This belongs to drive vehicle drive-function"+ abc);

    }

}
