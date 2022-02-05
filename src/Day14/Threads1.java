package Day14;
/*Threads run at the same time as other part of the program,
* there is no way to know in which order the code will run,
* When the threads and main program are reading and writing the same variables, the values are unpredictable.
* The problems that result from this are called concurrency problems.
 */
public class Threads1 extends Thread{
    public static int amount = 0;
    public static void main(String[] args) {
        Threads1 thread = new Threads1();
        thread.start();
        while(thread.isAlive()){
            System.out.println("Waiting ..............");
        }
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    public void run(){
        amount++;
    }
}
