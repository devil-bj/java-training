package Day4;

import java.util.logging.Logger;

public class ForEachLoop { // For each loop example
  public static void main(String[] args){
      String [] cars = {"BMW", "TOYOTA","FORD", "NISSAN", "CHEVROLET", "MERCEDES", "MUSTANG", "FERRARI", "HONDA", "MITSUBISHI"};
      for(String i:cars){
          Logger.getGlobal().info(i);
      }
  }
}
