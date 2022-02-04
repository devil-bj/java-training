package Day13;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
/*
* Lambda expression is a block of code which takes parameters and returns value
* It is like method but does not contain name like method */
public class LambdaExpression {  // example of lambda expression

    public static void main(String[] args) {
       Timer timer = new Timer(1000, e -> {
           System.out.println("At the tone, the time is" + Instant.ofEpochMilli(e.getWhen()));
           Toolkit.getDefaultToolkit().beep();
       });
        timer.start();
        JOptionPane.showMessageDialog(null, "quit program");
        System.exit(0);
    }
}
