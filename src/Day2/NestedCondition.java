package Day2;

import java.util.logging.Logger;

public class NestedCondition {                   //Nested if else statement
    public static void main(String []args){
        double maths = 33, science = 33, history = 32, english = 32,health = 32;
        double sumPercent = ((maths+science+history+english+health)/500)*100;
        if(maths>= 32 && science>=32 && history>=32 && english>=32 && health >=32){
            if (sumPercent>=80){
                Logger.getGlobal().info("Congratulations! You have Passed the exam with: Distinction  \n" + "Your Percentage : \t" + sumPercent + "%");
            }
            else if (sumPercent>=60){
                Logger.getGlobal().info("Congratulations! You have Passed the exam with: First Division  \n" + "Your Percentage  : \t" + sumPercent + "%");

            }
            else if(sumPercent>=40){
                Logger.getGlobal().info("Congratulations! You have Passed the exam with: Second Division  \n" + " Your Percentage : \t" + sumPercent + "%");
            }
            else if(sumPercent>=20){
                Logger.getGlobal().info("Congratulations! You have Passed the exam with: Third Division  \n" + " Your Percentage : \t" + sumPercent + "%");

            }
        }
        else {
                Logger.getGlobal().info("Sorry! You have Failed the exam: \n ");
               if(science<32){
                   Logger.getGlobal().info("You are failed in : Science \n " + " Marks : \t" + science );
               }
               if(maths<32){
                   Logger.getGlobal().info("You are failed in : Mathematics \n " + " Marks: \t" + maths );

               }
               if(history<32){
                   Logger.getGlobal().info("You are failed in : History \n " + " Marks : \t" + history );

               }
               if(english<32){
                   Logger.getGlobal().info("You are failed in : English \n " + " Marks: \t" + english );

               }
               if(health<32){
                   Logger.getGlobal().info("You are failed in : Health \n " + " Marks : \t" + health );

               }



        }
    }
}
