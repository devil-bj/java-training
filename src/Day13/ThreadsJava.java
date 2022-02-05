package Day13;



/*Generally, there are two ways to create threads.
* one is to use extends keywords
* other way is to use implements keyword
* Threads lets program to run concurrently in the background.
* can say allows multiple tasking.*/
public class ThreadsJava extends Thread {
    public static void main(String[] args) {
        ThreadsJava thread = new ThreadsJava();
        thread.start();
        System.out.println("Code is outside of the thread.");
        thread.myFunction();


    }
    void myFunction(){
        System.out.println("Code is inside of the thread.");

    }
}
