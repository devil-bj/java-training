package Day14;

public class FinallyBlock {
    public static void main(String[] args) {
        int [] myData = {22,34,1,2,3,4,5,8};
        try{
            System.out.println(myData[9]);
        }
        catch (Exception e){
            System.out.println("Error Caught");
        }
        finally {
            System.out.println("Try and catch block is executed. It's time for finally block");
        }

    }
}
