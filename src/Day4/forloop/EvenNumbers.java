package Day4.forloop;

import java.util.logging.Logger;

public class EvenNumbers {
    public static  void main(String []args){
        int i,num=20;
       for (i=0;i<=num;i++){
           if(i % 2 == 0){ // for odd number condition should be changed to not equal to Zero.
               Logger.getGlobal().info("Even Numbers: " + i);
           }
       }
    }
}
