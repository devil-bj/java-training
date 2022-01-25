package Day9;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

public class DateOfJava {
    public static void main(String []args){
        LocalDateTime time = LocalDateTime.now();
        Logger.getGlobal().info("Current date and time without formatting:  \t" + time);
        DateTimeFormatter current = DateTimeFormatter.ofPattern("dd:MM:yy HH:mm:ss");
        String FormattedDate = time.format(current);
        Logger.getGlobal().info("Date after formatting:" + FormattedDate);

    }


}
