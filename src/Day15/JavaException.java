package Day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaException extends RuntimeException{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);


        try{
            int age = scanner.nextInt();

            if (age<18){
                throw new MyException("Under Age Detected! You are not allowed to vote.");
            }

        }
        catch(InputMismatchException e){
            e.printStackTrace();
        }
        catch(MyException e){
            e.printStackTrace();
            System.out.println("This is custom Exception created by me.");
        }
        finally {
            System.out.println("Successfully handled exceptions.");

        }

    }
}
