package Day18;

import java.util.logging.Logger;

public class Main {  //
    public static void main(String[] args) {
        JavaRecord j1 = new JavaRecord("Bijay", 18);
        JavaRecord j2 = new JavaRecord("Bijay",18);
        j1.age();
        boolean val = j1.equals(j2);
        Logger.getGlobal().info(String.valueOf(val));

        SimpleClass  s1 = new SimpleClass("Bijay", 12);
        SimpleClass  s2 = new SimpleClass("Bijay", 12);

        boolean val2 = s1.equals(s2);
        Logger.getGlobal().info(String.valueOf(val2));
    }
}
