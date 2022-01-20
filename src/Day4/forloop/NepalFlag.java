package Day4.forloop;

import java.util.logging.Logger;

public class NepalFlag {
    public static  void main(String []args){
        int i,j,num=10;
        for ( i=0;i<=num;++i){
         for( j=1;j<=i;++j){
             System.out.print(" * ");
         }
            System.out.println("");
        }
        for ( i=0;i<=num;++i){

            for( j=1;j<=i;++j){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
