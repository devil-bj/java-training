package Day4.forloop;

import java.util.logging.Logger;

public class ForLoop { // Simple for loop example of adding first 10 numbers.
    public static void main(String[] args){
        int i,sum=0,num=10;
        for(i=0; i<=num;i++){
         sum = sum + i;
         Logger.getGlobal().info("adding"+sum);
        }
    }
}
