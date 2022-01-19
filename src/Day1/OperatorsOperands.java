package Day1;

import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;

import java.util.logging.Logger;

class OperatorsOperands {
    /* Operators are those who performs operations on operands like + / * - < > && !! are operators
                         operands are the variables like a, b, c, sum, mul according to this project */

    public static void main(String []args){
        //this is the example of operators and operands used in java programming.
        int a=5,b=5,c=10,sum,diff,mul,div;
        sum = a+b+c;   //Arithmetic  Operators   + - * / %
        diff =c-a;      // Assignment Operators  = ,+= ,-= , *=, /=
        mul = a*b*c;
        div = c/a;

        if(a>b && a>c){          // Comparison Operators and Logical Operators    (>,<,<=,>=,!=)  (&&,||,!)
            Logger.getGlobal().info("largest is A");
        }
         else if(b>a && b>c) {
             Logger.getGlobal().info("Largest is B");
        }
         else {
            Logger.getGlobal().info("Largest is C");   // \t is used for tab space and \n is used for new line.
        }
        Logger.getGlobal().info(String.valueOf("sum: "+ sum + "\tdifference: " + diff + "\tMultiply:" + mul + "\tdivision:" + div));
    }

}
