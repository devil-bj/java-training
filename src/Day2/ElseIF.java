package Day2;

import java.util.logging.Logger;

public class ElseIF {
    public static  void main(String[] args){
        double maths = 80, science = 85, social = 82, english = 90,health = 89;
        double sumPercent = ((maths+science+social+english+health)/500)*100;
        if (sumPercent>=80){
            Logger.getGlobal().info("Congratulations! You have Passed the exam with: Distinction  \n" + "You Percentage : \t" + sumPercent + "%");
        }
        else if (sumPercent>=60){
            Logger.getGlobal().info("Congratulations! You have Passed the exam with: First Division  \n" + "You Percentage : \t" + sumPercent + "%");

        }
        else if(sumPercent>=40){
            Logger.getGlobal().info("Congratulations! You have Passed the exam with: Second Division  \n" + "You Percentage : \t" + sumPercent + "%");
        }
        else if(sumPercent>=20){
            Logger.getGlobal().info("Congratulations! You have Passed the exam with: Third Division  \n" + "You Percentage : \t" + sumPercent + "%");

        }
        else {
            Logger.getGlobal().info("Sorry! You have Failed the exam: Null\n " + "You Percentage : \t" + sumPercent + "%");

        }
    }
}
