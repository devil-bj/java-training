package Day1;
// this section is used for comments.
// this indicates single line comments.
/* this indicates double line comments*/

import java.util.logging.Logger;

/**
 * this indicates documents comments
 * i can write as much doc comments as i like
 * just push enter
 * it's easy*/
public class Comments {
  public static void main(String []args){
        int a=2,b=5,c=5,sum,diff,mul; // these all are variables of integer data type.
        sum = a+b+c;
        mul = a*b*c;
        diff = (a+b)-c;
        System.out.println("Sum:" + sum);
        System.out.println("Difference:" + diff);
        System.out.println("Multiplication:"+ mul);
      Logger.getGlobal().info("Hello therer" + mul);
    }

}
