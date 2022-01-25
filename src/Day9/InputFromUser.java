package Day9;

import java.util.Scanner;
import java.util.logging.Logger;

//  In this example we are taking an input from the user rather than assigning it manually.
public class InputFromUser {

public static void main(String []args){
    UserInputs userInputs = new UserInputs();
    userInputs.method();
}

}

class UserInputs {
 void method(){
     Logger.getGlobal().info("Enter your details here: \n name , age and salary ");
     Scanner input = new Scanner(System.in);
     String name = input.nextLine();
     int age = input.nextInt();
     double salary = input.nextDouble();
     Logger.getGlobal().info("Your Name is :" +name );
     Logger.getGlobal().info("Your Age is :" + age );
     Logger.getGlobal().info("Your Salary is :" + salary );
 }



}
