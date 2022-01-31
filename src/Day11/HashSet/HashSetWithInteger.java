package Day11.HashSet;

import java.util.HashSet;
import java.util.logging.Logger;

public class HashSetWithInteger {
    public static void main(String[] args) {
        HashSet <Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        Logger.getGlobal().info(String.valueOf(numbers.contains(3)));
        Logger.getGlobal().info(String.valueOf(numbers.size()));
        for(int i : numbers){
            Logger.getGlobal().info(String.valueOf(i));
            if(numbers.contains(i)){
                Logger.getGlobal().info(+i+"\tItems in the list");
            }
            else
            {
                Logger.getGlobal().info("Item s not in the list");
            }
        }

    }
}
