package Day2;

import java.util.logging.Logger;

public class IfElse {
    public static  void main(String []args){
        double maths = 20, science = 85, social = 82, english = 90,health = 89;
        double sumPercent = ((maths+science+social+english+health)/500)*100;
        if (maths> 32 && science>32 && social>32 && english>32 && health >32){
            Logger.getGlobal().info(String.valueOf("Congratulations! You have Passed the exam: \n "+"You Percentage : \t" + sumPercent + "%"));
        }
        else{
            Logger.getGlobal().info(String.valueOf("Sorry! You have Failed the exam: \n "+"You Percentage : \t" + sumPercent + "%"));
        }
    }

}
