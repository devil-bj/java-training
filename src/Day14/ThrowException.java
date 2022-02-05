package Day14;

// this throw keyword allows us to create a custom error
//
public class ThrowException{
    static  void myMethod(int age){
        if (age<18){
            throw new ArithmeticException("You are not old enough to buy beer.");
        }
        else {
            throw  new ArithmeticException("You are eligible. Cheers ");
        }
    }

    public static void main(String[] args) {
        myMethod(19);

    }
}
