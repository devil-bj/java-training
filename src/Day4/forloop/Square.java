package Day4.forloop;

public class Square { // example of square of nested for loop.
    public static void main(String []args){
        int i,j,num=8;

        for ( i=1;i<=num;++i){

            for( j=1;j<=num;++j){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
