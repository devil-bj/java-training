package Day14;

public class ExceptionHandling {
   static int [] mynum = {2,3,4,5};
    public static void main(String[] args) {
        try {
            System.out.println(mynum[10]);

        }
        catch(Exception e){
            System.out.println("something went wrong");
        }
    }
}
